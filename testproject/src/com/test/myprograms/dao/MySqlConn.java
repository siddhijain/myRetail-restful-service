package com.test.myprograms.dao;
import java.sql.*;

public class MySqlConn {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/mydatabase","root","root");  
		
	//	String query = "Insert into Employee VALUES(4,'Thomas')";
		
		 PreparedStatement preparedStmt = con.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?");
		 preparedStmt.setInt(1, 4);
	   //   PreparedStatement preparedStmt = con.prepareStatement(query);
	      // execute the java preparedstatement
	      preparedStmt.executeUpdate();
		
	Statement stmt=con.createStatement(); 
		
	/**	String insertTableSQL = "INSERT INTO EMPLOYEE"
				+ "VALUES"
				+ "(3,'Siddhant' + )";
		stmt.executeUpdate(insertTableSQL); */
		ResultSet rs=stmt.executeQuery("select * from Employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		rs.close();
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		
	}  
		
}  
