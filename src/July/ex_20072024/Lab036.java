package July.ex_20072024;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a char, I will tell you, If it is a vowel or not!");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("This is not a Vowel");
                break;
        }
    }
}
