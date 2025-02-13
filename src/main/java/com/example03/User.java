package com.example03;

public class User {
    public static final String MALE = "男";
    public static final String FEMALE = "女";
    private String name;
    private String gender;

    private User(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public static UserBuilder mybuilder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private String gender;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public User build() {
            return new User(name, gender);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
