package com.jdbc.main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
//import com.jdbc.db.DbUtil;
//import com.jdbc.db.JDBCMySQLConnection;
import com.jdbc.to.Student;


public class JDBCMySQLConnector {

//	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Student Id");
//		int studentId;
//		
//		try {
//			studentId = Integer.parseInt(br.readLine());
//			JDBCMySQLConnector connector = new JDBCMySQLConnector();
//			Student student = connector.getStudent(studentId);
//			System.out.println(student);
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//		
//		public Student getStudent(int studentId)
//		{
//			ResultSet rs = null;
//			Connection connection = null;
//			Statement statement = null;
//			
//			Student student = null;
//			String query = "SELECT * FROM studentinformation WHERE studentid=" + studentId;
//			
//			try {
//				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank?autoReconnect=true&useSSL=false","root","root");
//				statement = connection.createStatement();
//				rs = statement.executeQuery(query);
//				
//				if(rs.next()) {
//					student = new Student();
//					student.setStudentId(rs.getInt("studentId"));
//					student.setStudentName(rs.getString("studentName"));
//					student.setAge(rs.getInt("age"));
//					student.setLocalAddress(rs.getString("localAddress"));
//				}
//			} catch (SQLException e)
//			{
//				e.printStackTrace();
//			} finally {
//				if(connection!=null) {
//					try {
//						connection.close();
//					}
//					catch (SQLException e) {
//						e.printStackTrace();
//					}
//							
//				}
//			}
//			return student;
//		}
	
	Connection connection = null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/credit_bank?autoReconnect=true&useSSL=false", "root", "root");
			return connection;
		}
		catch(Exception e2)
		{
<<<<<<< HEAD
			System.out.println(e2);
			return null;
		}
	}

=======
			ResultSet rs = null;
			Connection connection = null;
			Statement statement = null;
			
			Student student = null;
			String query = "SELECT * FROM login WHERE student_id=" + studentId;
			
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false", "root", "");
				statement = connection.createStatement();
				rs = statement.executeQuery(query);
				
				if(rs.next()) {
					student = new Student();
					student.setStudentId(rs.getInt("student_id"));
					student.setStudentName(rs.getString("Name"));
					student.setAge(rs.getInt("Age"));
					student.setLocalAddress(rs.getString("Address"));
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
>>>>>>> f10877da3672be0f2987b3cb99a66eab808c4d97
}
