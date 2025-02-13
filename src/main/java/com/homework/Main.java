package com.homework;

public class Main {
    public static void main(String[] args) {
        // 测试注册功能
        Student student1 = new Student("李四", "20210002", "lisi", "123456");
        StudentDAO.insertStudent(student1);

        // 测试登录功能
        Student student2 = StudentDAO.getStudentByNicknameAndPassword("lisi", "123456");
        if (student2 != null) {
            System.out.println("登录成功！欢迎回来，" + student2.getName());
        } else {
            System.out.println("登录失败！用户名或密码错误。");
        }
    }
}

