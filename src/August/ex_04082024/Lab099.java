package August.ex_04082024;

import java.util.Scanner;

public class Lab099 {
    public static void main(String[] args) {
        BankAccount ba1= new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bank name here : ");
        String bName= sc.next();
        System.out.println("Enter your balance :");
        int bal = sc.nextInt();
        System.out.println("Enter your Bank Code : ");
        String bCode= sc.next();

        BankAccount ba2 = new BankAccount("ICICI",9087656,"ICICI456");
        ba2.printDetails();
        sc.close();
    }
}
