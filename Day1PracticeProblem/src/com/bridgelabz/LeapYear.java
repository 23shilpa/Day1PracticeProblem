package com.bridgelabz;
import java.util.Scanner;
//Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

public class LeapYear {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = Scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + "is a leap year.");
        } else  {
            System.out.println(year + "is not a leap year.");

        }

        Scanner.close();
    }
}
