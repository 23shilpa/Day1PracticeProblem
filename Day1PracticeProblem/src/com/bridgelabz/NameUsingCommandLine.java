package com.bridgelabz;
//To get the name using the command line.

public class NameUsingCommandLine {
    public static void main(String[] args) {
        System.out.println("Command Line Arguments are");
        for(String str: args){
            System.out.println(str);
        }
    }
}

