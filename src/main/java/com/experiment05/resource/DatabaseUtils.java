package com.experiment05.resource;

import com.experiment05.entity.College;
import com.experiment05.entity.Teacher;
import com.experiment05.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Student> students = new ArrayList<>();
    private static final List<Teacher> teachers = new ArrayList<Teacher>();

    static {
        College college1 = new College("计控学院");
        College college2 = new College("机电学院");

        Teacher teacher1 = new Teacher("1001", "Smith", college1);
        Teacher teacher2 = new Teacher("1002", "Jane", college2);

        teachers.add(teacher1);
        teachers.add(teacher2);

        students.add(new Student("202201", "Alice", "2022", teacher1));
        students.add(new Student("202202", "Bob", "2022", teacher1));
        students.add(new Student("202203", "Tom", "2022", teacher2));
        students.add(new Student("202204", "John", "2022", teacher2));
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }
}
