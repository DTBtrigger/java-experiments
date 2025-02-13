package com.experiment05;

import com.experiment05.entity.Student;
import com.experiment05.entity.Teacher;
import com.experiment05.resource.DatabaseUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<Student> students = DatabaseUtils.getStudents();

        // 测试方法1
        getCollegeName(students.get(0));

        // 测试方法2
        isTeacher(students.get(0), "Smith");

        // 测试方法3
        getCollegeName(students, "202201");

        // 测试方法4
        printCollegeName(students, "202201", "1001");
    }

    /**
     * 基于给定学生，获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     * @param student 学生对象
     * @return 学院名称
     */
    private static void getCollegeName(Student student) {
        Optional.ofNullable(student)
                .map(Student::getTeacher)
                .map(Teacher::getCollege)
                .map(college -> college.getName())
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("未知学院")
                );
    }

    /**
     * 基于给定学生及教师姓名，判断是否为给定学生的指导教师。
     * 不匹配或不存在，均返回false
     * @param student 学生对象
     * @param teacherName 教师姓名
     * @return 是否为指导教师
     */
    private static void isTeacher(Student student, String teacherName) {
        boolean result = Optional.ofNullable(student)
                .map(Student::getTeacher)
                .map(Teacher::getName)
                .filter(name -> name.equals(teacherName))
                .isPresent();
        System.out.println(result);
    }

    /**
     * 基于给定学生集合，学生编号，实现获取学生的导师的所在学院名称。
     * 任何一项不存在或失败，返回 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students 学生集合
     * @param sNumber 学生编号
     * @return 学院名称
     */
    private static void getCollegeName(List<Student> students, String sNumber) {
        Optional<Student> student = students.stream()
                .filter(s -> Objects.equals(s.getId(), sNumber))
                .findFirst();

        getCollegeName(student.orElse(null));
    }

    /**
     * 实现在给定学生集合中查询指定编号学生，如果学生导师编号为指定编号，打印显式导师所在学院名称。
     * 任何一项不存在或失败，打印显式 未知学院
     * 结合collection stream findFirst()方法实现
     * 可直接通过一条方法链实现
     * @param students 学生集合
     * @param sNumber 学生编号
     * @param tNumber 教师编号
     */
    private static void printCollegeName(List<Student> students, String sNumber, String tNumber) {
        Optional<Student> student = students.stream()
                .filter(s -> Objects.equals(s.getId(), sNumber))
                .findFirst();

        Optional<Teacher> teacher = DatabaseUtils.getTeachers().stream()
                .filter(t -> Objects.equals(t.getId(), tNumber))
                .findFirst();

        if (student.isPresent() && teacher.isPresent() && Objects.equals(student.get().getTeacher().getId(), tNumber)) {
            System.out.println(teacher.get().getCollege().getName());
        } else {
            System.out.println("未知学院");
        }
    }
}
