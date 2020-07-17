package com.company;

public class Student extends Person {
    private String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
