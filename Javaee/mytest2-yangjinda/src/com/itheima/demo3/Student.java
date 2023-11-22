package com.itheima.demo3;

import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private String sex;
    private LocalDateTime time;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }

    public Student(int id, String name, String sex, LocalDateTime time, String location) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.time = time;
        this.location = location;
    }
}
