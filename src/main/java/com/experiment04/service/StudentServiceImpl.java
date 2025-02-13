package com.experiment04.service;

import com.experiment04.entity.Student;
import com.experiment04.resourse.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> listStudentsBySex(String sex) {
        return DatabaseUtils.studentList().stream()
                .filter(student -> student.getSex().equals(sex))
                .collect(Collectors.toList());
    }
    @Override
    public List<Student> addStudent(Student student) {
        List<Student> students = DatabaseUtils.studentList();
        students.add(student);
        return students;
    }

    @Override
    public List<Student> removeStudent(String id) {
        List<Student> students = DatabaseUtils.studentList();
        students.removeIf(student -> student.getId().equals(id));
        return students;
    }
}
