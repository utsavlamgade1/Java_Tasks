package com.codewithUtsav;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
        Date dateNow = new Date();
        System.out.println(dateNow);
        String message = "Is This The Real Life Or Is This Just Fantasy!!";
        System.out.println(message.toLowerCase());
        System.out.println(message.replace("!!", "..."));
        System.out.println(message.toUpperCase());
        System.out.println(message.length());
        System.out.println(message);
    }
}
