package guiproject11;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;

public class Database {
	Connection con = null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false", "root", "");
			return conn;
		}
		catch(Exception e2)
		{
			System.out.println(e2);
			return null;
		}
	}
}