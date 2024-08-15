package July.ex_20072024;

import java.util.Scanner;

public class Lab031 {
    public static void main(String[] args) {
        // maximum number in 2 inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the first number :");
        int input1= sc.nextInt();
        System.out.println("Please Enter the Second number:");
        int input2= sc.nextInt();

        if (input1>input2){
            System.out.println("The Maximum number is :"+input1);
        }else if(input2>input1) {
            System.out.println("The Maximum number is :"+input2);
        }else {
            System.out.println("both numbers are equal");
        }
    }
}
