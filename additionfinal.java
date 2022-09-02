package com.company;
import java.util.Scanner;

public class addfinal {
    public static void main(String[] args) {
        System.out.println("Final addition program");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name here: ");
        String name = sc.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println(", hopefully you are doing well!");
        System.out.println("Now let's do the addition");
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        int c=a+b;
        System.out.print("The sum of the numbers you input is: ");
        System.out.println(c);

        System.out.println("*END OF PROGRAM*");
        System.out.println("Simple addition Java program");
        System.out.println("Created by Js Industries limited");
    }
}
