package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import mssql.*;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlserver://"
				+ "localhost;\r\n" + 
				"databaseName=OLX;\r\n" + 
				"user=sa;\r\n" + 
				"password=nathan123;";
		try {
			System.out.println("Connecting to database");
			
			Connection myCon = null;
			myCon = DriverManager.getConnection(jdbcUrl);
			//myCon.close();
			System.out.println("Successful!");
		}catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
