package com.videxedge;

import java.util.Arrays;

public class Main {

    public static int[] filter(int[] arr, int num) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != num) {
                count++;
            }
        }
        int[] outarr = new int[count];
        count = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] != num) {
                outarr[count] = arr[i];
                count++;
            }
        }
        return outarr;
    }

    public static void Q1() {
        int[] arr = {6,9,2,2,9,4,-3};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = filter(arr,9);
        System.out.println(Arrays.toString(arr2));
    }

    public static void printExcellent(ReportCard[] array) {
        for (int i=0; i< array.length; i++) {
            if (array[i].isExcellent()) {
                System.out.println(array[i].getStuName()+" is excellent");
            }
        }
    }

    public static void Q2() {
        Subject sub1 = new Subject("Math", 90);
        Subject sub2 = new Subject("Language", 95);
        Subject sub3 = new Subject("English", 85);
        Subject sub4 = new Subject("English", 100);
        Subject sub5 = new Subject("English", 50);
        Subject[] arr1 = {sub1,sub2,sub3};
        Subject[] arr2 = {sub1,sub2,sub4};
        Subject[] arr3 = {sub1,sub2,sub5};
        ReportCard alfa = new ReportCard("alfa",3);
        ReportCard bravo = new ReportCard("bravo",3);
        ReportCard charly = new ReportCard("charly",3);
        alfa.setSubArray(arr1);
        bravo.setSubArray(arr2);
        charly.setSubArray(arr3);
        ReportCard[] group = {alfa,bravo,charly};
        printExcellent(group);
    }

    public static MyString special(MyString ms) {
        MyString newms = new MyString();
        while (!ms.isEmpty()) {
            char ch = ms.firstChar();
            for (int i=0; i<ms.countChar(ch); i++) {
                newms.appendChar(ch);
            }
            ms.removeChar(ch);
        }
        return newms;
    }

    public static void Q3() {
        MyString ms1 = new MyString();
        ms1.appendChar('b');
        ms1.appendChar('a');
        ms1.appendChar('b');
        ms1.appendChar('c');
        ms1.appendChar('a');
        System.out.println(ms1.toString());
        MyString ms2 = special(ms1);
        System.out.println(ms2.toString());
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
    }
}
