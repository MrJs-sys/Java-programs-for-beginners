package com.company;
import java.util.Scanner;

public class userinputprog {
    public static void main(String[] args) {
        System.out.println("This is a simple addition java program");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.print("sum of the input numbers is: ");
        System.out.println(sum);

    }
}
