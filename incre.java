package com.company;
import java.util.Scanner;

public class increop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to make an increment in : ");
        int x = sc.nextInt();
        System.out.println(++x);
    }
}
