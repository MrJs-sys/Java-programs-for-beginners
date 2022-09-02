package com.company;
import java.util.Scanner;

public class miles2kms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Miles for conversion to Kms: ");
        float m = sc.nextFloat();

        double y = m*1.609;
        System.out.println( m + " miles is equal to "+ y + " kms");

    }
}
