package com.homework;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // JDBC连接URL
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_database";
    // 数据库用户名
    static final String USERNAME = "root";
    // 数据库密码
    static final String PASSWORD = "lanyuanzi2002,";

    // 获取数据库连接方法
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}
