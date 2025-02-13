package com.example03;

public class Test {
    public static void main(String[] args) {
        User user = User.mybuilder()
                .name("李四")
                .gender(User.FEMALE)
                .build();
        Course course = Course.myBuilder()
                        .id("1212")
                        .build();
        System.out.println(user.toString());
        System.out.println(course.toString());

    }
}
