package com.test.myprograms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.test.myprograms.model.Employee;

@Component
public class JdbcTemplateDaoImpl {
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	//Using just datasource to get connection
	public Employee getEmployee(int id) {
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			
			PreparedStatement ps = conn.prepareStatement("Select * from Employee where employeeId=?");
			ps.setInt(1, id);
			
			Employee employee = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				employee = new Employee(id,rs.getString("employeeName"));
			}
			 
			rs.close();
			conn.close();
			return employee;	
			
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		return null;	
	}
	
	public Employee getEmployeeById(int id) {
		jdbcTemplate.setDataSource(getDataSource());
		String sql = "Select * from Employee where employeeId = ?";
		return jdbcTemplate.queryForObject(sql,new Object[] {id},new EmployeeMapper());
	}
	
	//using JDBCTemplate
		public int getEmployeesCount() {
			String sql = "Select count(*) from Employee";
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate.queryForObject(sql,Integer.class);
			
	}
	
	public String getEmployeeName(int id) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject("Select employeeName from Employee where employeeId = ?", new Object[]{id}, String.class);
	}
	
	public List<Employee> getListOfEmployees(){
		return jdbcTemplate.query("Select * from Employee", new EmployeeMapper() );
		
	}
	
	public void insertEmployee(Employee e) {
		String sql = "Insert into Employee VALUES(?,?)";
		jdbcTemplate.update(sql, new Object[] {e.getEmployeeId(), e.getEmployeeName()});
		
		
	}
	
	private static final class EmployeeMapper implements RowMapper<Employee>{

		@Override
		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
	/**		Employee result = new Employee();
			result.setEmployeeId(resultSet.getInt("EMPLOYEEID"));
			result.setEmployeeName(resultSet.getString("EMPLOYEENAME")); */
			return new Employee(resultSet.getInt("EMPLOYEEID"),resultSet.getString("EMPLOYEENAME"));
			
			
		}
		
	}
	
	
	
	

}
