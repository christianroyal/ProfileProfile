package com.example.profileprofile;

import java.io.Serializable;

public class Profile implements Serializable {
    private String name, email, age, sex;
    Profile() {
    }

    public Profile(String Name, String Email) {
        this.name = Name;
        this.email = Email;
        this.age = "";
        this.sex = "";
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Age='" + age + '\'' +
                ", Gender='" + sex + '\'' +
                '}';
    }
}

