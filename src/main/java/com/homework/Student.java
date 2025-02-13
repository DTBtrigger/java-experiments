package com.homework;

public class Student {
    private String name;
    private String studentId;
    private String nickname;
    private String password;

    // 构造函数
    public Student(String name, String studentId, String nickname, String password) {
        this.name = name;
        this.studentId = studentId;
        this.nickname = nickname;
        this.password = password;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
