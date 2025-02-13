package com.experiment04.resourse;

import com.experiment04.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> STUDENTS = create();
    private static List<Student> create(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("202201","Alice","女"));
        students.add(new Student("202202","Lucy","女"));
        students.add(new Student("202203","John","男"));
        students.add(new Student("202204","Tom","男"));
        students.add(new Student("202205","Bob","男"));
        return students;
    }

    public static List<Student> studentList(){
        return STUDENTS;
    }
}
