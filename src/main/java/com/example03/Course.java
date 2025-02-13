package com.example03;

public class Course {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class CourseBuilder {
        private String id;
        private String name;

        public CourseBuilder id(String id) {
            this.id = id;
            return this;
        }
        public CourseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Course build() {
            return new Course(id,name);
        }

    }

    public static CourseBuilder myBuilder() {
        return new CourseBuilder();
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
