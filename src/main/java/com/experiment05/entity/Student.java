package com.experiment05.entity;

public class Student {
    private String id;
    private String name;
    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private Teacher teacher;

    public Student(String id, String name, String grade, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
    }

}
