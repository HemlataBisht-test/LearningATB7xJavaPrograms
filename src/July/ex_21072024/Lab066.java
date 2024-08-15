package July.ex_21072024;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {
        // Coding Program
        // Factorial Program
        //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number, I will print Factorial");
        int input=sc.nextInt();
        int fact=1;
        for (int i =1;i<=input;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
