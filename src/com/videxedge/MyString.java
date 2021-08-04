package com.videxedge;

public class MyString {
    private String str;

    public MyString() {
        this.str = "";
    }

    public int countChar(char ch) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public void removeChar(char ch) {
        String newstr = "";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ch) {
                newstr += str.charAt(i);
            }
        }
        this.str = newstr;
    }

    public void appendChar(char ch) {
        this.str += ch;
    }

    public char firstChar() {
        return this.str.charAt(0);
    }

    public boolean isEmpty() {
        return this.str == "";
    }

    @Override
    public String toString() {
        return str;
    }
}
