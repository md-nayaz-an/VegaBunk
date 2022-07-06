package db.scripts;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class init {
	public void connectDB() {
		//String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/";
		String USER = "cheeseburger";
		String PASS = "Iambatman@69";
   
		ResultSet rs;
		try{
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver( myDriver );
      
			System.out.println("Connecting to database...");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
  
			System.out.println("Creating statement...");
			Statement stmt = conn.createStatement();
  
			rs = conn.getMetaData().getCatalogs();
			
			while (rs.next()) {
				if(rs.getString(1) == "STUDENT_DB") {
					stmt.execute("DROP DATABASE STUDENT_DB;");
					break;
				}
			}
			String[] sql = {"CREATE DATABASE student_db;","CREATE TABLE user_auth"};
			stmt.execute(sql[0]);

			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Goodbye!");
	   	}
}
