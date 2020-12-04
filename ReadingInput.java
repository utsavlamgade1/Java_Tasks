package com.codewithUtsav;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        // input number
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println("Your age is " + age);*/

        // input name
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        //String name = scanner.next(); //this is for one word input
        String name= scanner.nextLine().trim(); //this is for multiple word input and trim method to trim the ends
        System.out.println("Your name is "+name);
    }
}
