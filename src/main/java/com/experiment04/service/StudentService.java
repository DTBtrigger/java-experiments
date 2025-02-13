package com.experiment04.service;

import com.experiment04.entity.Student;
import java.util.List;
import java.util.Map;

public interface StudentService {
    List<Student> addStudent(Student student);
    List<Student> listStudentsBySex(String sex);
    List<Student> removeStudent(String id);
}
