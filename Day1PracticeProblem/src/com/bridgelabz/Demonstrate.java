package com.bridgelabz;
//Write a program to demonstrate static variables, methods, and blocks.
public class Demonstrate {
    static int x = 10;
    static int y;
    public static void main(int z) {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
    static {
        System.out.println("Running static initialization");
        y = x + 5;

    }
    public static void main(String[] args) {

    }
}
