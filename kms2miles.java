package com.company;
import java.util.Scanner;

public class kms2miles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter kms for conversion into miles: ");
        float a = sc.nextFloat();

        double con = a*0.621;
        System.out.println(a + " kms is equal to " + con +" miles");

        System.out.println("\nSystem created by Js Industries limited.");

    }
}