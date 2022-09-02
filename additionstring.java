package com.company;
import java.util.Scanner;

public class nameageinput {
    public static void main(String[] args) {

        System.out.println("input program test 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your first name: ");
        String name = sc.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println(", Hope you are doing well!");

        System.out.println("now lets add the numbers you want the sum of-");
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of the input numbers is: ");
        System.out.println(sum);
        System.out.println("*END OF TASK*");
        System.out.print("Simple addition program with java by JS INDUSTRIES LIMITED");


    }
}
