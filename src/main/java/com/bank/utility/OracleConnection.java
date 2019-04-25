package com.bank.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection{
	public Connection dataConnection() 
	   {
		 Connection connect=null;
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","capgemini","oracle");
		        
			  	} catch (ClassNotFoundException |SQLException  e) {
			e.printStackTrace();
		}
		 return connect; 
	}
}
