package com.jdbc.main;


import java.io.BufferedReader;
import com.mysql.jdbc.ResultSetMetaData;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import com.jdbc.to.*;
//import com.jdbc.db.DbUtil;
//import com.jdbc.db.JDBCMySQLConnection;
import com.jdbc.to.Student;


public class JDBCMySQLConnector {
	
	Connection con = null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank?autoReconnect=true&useSSL=false", "root", "root");
//			return connection;
//		}
//		catch(Exception e2)
//		{
//			System.out.println(e2);
//			return null;
//		}
	

			ResultSet rs = null;
			Connection connection = null;
			Statement statement = null;
			
//			Student student = null;
			String query = "SELECT * FROM studentinformation" ;
			Student student = new Student();
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false", "root", "root");
				statement = connection.createStatement();
				rs = statement.executeQuery(query);
				
				if(rs.next()) {
					student.setStudentId(rs.getInt("studentId"));
					student.setStudentName(rs.getString("studentName"));
					student.setAge(rs.getInt("age"));
					student.setLocalAddress(rs.getString("address"));
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			} finally {
				if(connection!=null) {
					try {
						connection.close();
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
							
				}
			}
			return student;
		}
}
