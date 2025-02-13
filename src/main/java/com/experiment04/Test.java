package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.service.StudentService;
import com.experiment04.service.StudentServiceImpl;

public class Test {
    private static final StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        testListStudentsBySex();
        testAddStudent();
        testRemoveStudent();
    }

    private static void testListStudentsBySex() {
        System.out.println("Students by sex (male): " + studentService.listStudentsBySex("男"));
    }

    private static void testAddStudent() {
        Student newStudent = new Student("202206", "Eve", "女");
        System.out.println("Add student: " + studentService.addStudent(newStudent));
    }

    private static void testRemoveStudent() {
        System.out.println("Remove student (202205): " + studentService.removeStudent("202205"));
    }
}

