package ex_20072024;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int num1 =sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int num2 =sc.nextInt();
        System.out.println("Enter the 3rd Number");
        int num3 =sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Greater number is :"+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Greater number is :"+num2);
        }else {
            System.out.println("Greater number is :"+num3);
        }


    }
}
