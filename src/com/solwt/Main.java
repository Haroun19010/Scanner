package com.solwt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Scanner */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        byte age = scanner.nextByte();
        System.out.print("You are:" + age);

        Scanner scannername = new Scanner(System.in);
        System.out.print("\nEnter your Name: ");
        String Name = scannername.nextLine();
        System.out.print("You are: " + Name);
    }
}
