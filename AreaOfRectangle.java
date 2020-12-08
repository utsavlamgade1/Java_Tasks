package com.codewithUtsav;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("The area of the rectangle is "+ areaRectangle(7.25D,4.35D));
        System.out.println("The area of the rectangle is "+ areaSquare(8));

    }
    public static double areaRectangle(double length, double width){
        return (length*width);
    }
    public static double areaSquare(double length){
        return (length*length);
    }
    public static int areaSquare(int length){
        return (length*length);
    }
}
