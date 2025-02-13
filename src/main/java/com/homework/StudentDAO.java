package com.homework;

import java.sql.*;

public class StudentDAO {
    // 插入学生信息方法
    public static void insertStudent(Student student) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO student (name, student_id, nickname, password) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getStudentId());
            stmt.setString(3, student.getNickname());
            stmt.setString(4, student.getPassword());
            stmt.executeUpdate();
            System.out.println("学生注册成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 根据昵称和密码查询学生方法
    public static Student getStudentByNicknameAndPassword(String nickname, String password) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM student WHERE nickname = ? AND password = ?")) {
            stmt.setString(1, nickname);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Student(rs.getString("name"), rs.getString("student_id"),
                        rs.getString("nickname"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
