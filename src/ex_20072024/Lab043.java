package ex_20072024;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name= sc.next();

        System.out.println("Please Enter your Age :");
        int age =sc.nextInt();

        System.out.println("Enter your Salary : ");
        double salary =sc.nextDouble();


        System.out.println("Your name is :" +name);
        System.out.println("Your age is :"+age);
        System.out.println("Your Salary is :"+salary);
    }
}
