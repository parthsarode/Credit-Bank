package com.jdbc.db;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException ;

public class JDBCMySQLConnection {

//Static reference to itself

private static JDBCMySQLConnection instance = new JDBCMySQLConnection();

public static final String URL = "jdbc:mysql://localhost/Credit_Bank";

public static final String USER = "Root";

public static final String PASSWORD = "";
public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

//private constructor

private JDBCMySQLConnection() {

try {

//step 2: Load MySQL Java driver

Class.forName (DRIVER_CLASS);

} catch (ClassNotFoundException e) {

e.printStackTrace();
}
}
private Connection createConnection() {
Connection connection = null;
try {
     //Step 3: Establish java mysql connection 
     connection = DriverManager.getConnection(URL, USER, PASSWORD);
}
catch (SQLException e) {
       System.out.println("ERROR: Unable to connect to Database. ");
}
return connection;
}

public static Connection getConnection(){
        return instance.createConnection();
    }
}
