package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class TestDbConnection
 */
@WebServlet("/TestDbConnection")
public class TestDbConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setup connection variables
   		String jdbcUrl = "jdbc:sqlserver://"
				+ "localhost;\r\n" + 
				"databaseName=SPRING_CUSTOMER_PROJECT;\r\n" + 
				"user=sa;\r\n" + 
				"password=nathan123;";
		try {
	           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	    
		        Connection conn1 = DriverManager.getConnection(jdbcUrl);
		        if (conn1 != null) {
		             System.out.println("Connected to the database test1");
		        }
		   } catch (SQLException ex) {
		            System.out.println("An error occurred. Maybe user/password is invalid");
		            ex.printStackTrace();
		   } catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		   }

	}

}
