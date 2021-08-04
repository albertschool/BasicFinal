package com.videxedge;

public class Subject {
    private String subName;
    private int grade;

    public Subject(String subName, int grade) {
        this.subName = subName;
        this.grade = grade;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
