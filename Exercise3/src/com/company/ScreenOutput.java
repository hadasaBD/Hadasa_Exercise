package com.company;


public class ScreenOutput implements Output {

    @Override
    public void output(String s) {
        System.out.println(s);
    }
}
