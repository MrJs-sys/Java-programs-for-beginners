package com.company;
import java.util.Scanner;

public class cbsepercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there!, welcome to CBSE BOARD exam percentage calculator!");
        System.out.println("Enter your name here: ");
        String name = sc.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println(", here you will need to enter your marks scored in every subject one by one and then our system will give you your percentage obtained");
        System.out.println("Enter marks of social studies: ");
        float ss = sc.nextFloat();
        System.out.println("Enter marks of science: ");
        float si = sc.nextFloat();
        System.out.println("Enter marks of maths: ");
        float mt = sc.nextFloat();
        System.out.println("Enter marks of english: ");
        float en = sc.nextFloat();
        System.out.println("Enter marks of optional subject eg:- hindi, sanskrit, etc.");
        float os = sc.nextFloat();

        float sum = ss + si + mt + en + os;
        float perk = sum/500;
        float fin = perk*100;

        System.out.print("Your total percentage obtained in CBSE board exams is: ");
        System.out.print(fin);
        System.out.println("%");

        System.out.println("System created");
        System.out.println("by:- Js industries limited");

    }
}
