package com.codewithUtsav;

public class HelloMethodOverloading {
    public static void main(String[] args){
        System.out.println("The sum of 2 and 4 is "+sum(2,4));
        System.out.println("The sum of 12 and 23.44 is "+sum(2,23.44F));
        System.out.println("The sum of 34.56 and 44.56 is "+sum(34.56,44.56));
        System.out.println("The sum of 3 numbers is "+sum(2,4,5));
    }
    public static int sum(int x, int y){
        System.out.print("The sum of two integers ---> ");
        return x+y;
    }
    public static float sum(int x, float y){
        System.out.print("The sum of one integer and a float ---> ");
        return x+y;
    }
    public static double sum(double x, double y){
        System.out.print("The sum of two doubles ---> ");
        double v = x + y;
        return v;
    }
    public static int sum(int x, int y, int z){
        System.out.print("The sum of three integers ---> ");
        return x+y+z;
    }
}
