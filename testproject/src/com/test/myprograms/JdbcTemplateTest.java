package com.test.myprograms;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.test.myprograms.dao.JdbcTemplateDaoImpl;
import com.test.myprograms.model.Employee;

public class JdbcTemplateTest {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public JdbcTemplate getJdbcTemplate() {  
	    return jdbcTemplate;  
	} 
	
/**	public void getEmployees() {
		String sql = "SELECT EMPLOYEEID, EMPLOYEENAME FROM EMPLOYEE";
	    List<Map<String, Object>> list = new JDBCTemplateTest().getJdbcTemplate().queryForList(sql);
	    for (Map<String, Object> row : list) {
	        System.out.println(row.get("name"));
	    }   
	} */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcTemplateDaoImpl dao = ctx.getBean("jdbcTemplateDaoImpl", JdbcTemplateDaoImpl.class); 

		Employee e = dao.getEmployee(1);
		System.out.println(e.getEmployeeName()); 
		System.out.println(dao.getEmployeesCount());
		System.out.println(dao.getEmployeeName(2));
		System.out.println(dao.getEmployeeById(3));
		System.out.println(dao.getListOfEmployees().size());
		
		dao.insertEmployee(new Employee(6,"James"));
		System.out.println(dao.getEmployeeName(6));	
		
	
	}

}
