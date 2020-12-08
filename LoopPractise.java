package com.codewithUtsav;

public class LoopPractise {
    public static void main(String[] args) {
        int u = 20;
        while (u > 10) {
            System.out.println(u);
            u--;

        }
        new LoopPractise().loop1();
    }

    public void loop1() {
        System.out.println("************----------------**************");
        int l = 20;
        while (l < 33) {
            System.out.println(l);
            l++;
        }
    }
}