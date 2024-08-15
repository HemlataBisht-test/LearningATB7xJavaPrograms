package July.ex_20072024;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year :");
        int year = sc.nextInt();

        if (year%4==0){
            System.out.println("This is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }
    }
}
