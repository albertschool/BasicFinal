package com.videxedge;

import java.util.Arrays;

public class ReportCard {
    private String stuName;
    private Subject[] subArray;

    public ReportCard(String name, int num) {
        this.stuName = name;
        this.subArray = new Subject[num];
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Subject[] getSubArray() {
        return subArray;
    }

    public void setSubArray(Subject[] subArray) {
        this.subArray = subArray;
    }

    public double average() {
        int sum = 0;
        for (int i=0; i<subArray.length; i++) {
            sum += subArray[i].getGrade();
        }
        return sum/subArray.length;
    }

    public boolean isExcellent() {
        if (average() >= 85) {
            int count = 0;
            for (int i=0; i<subArray.length; i++) {
                if (subArray[i].getGrade() <= 54) {
                    return false;
                } else if (subArray[i].getGrade() == 100) {
                    count++;
                }
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "stuName='" + stuName + '\'' +
                ", subArray=" + Arrays.toString(subArray) +
                '}';
    }
}
