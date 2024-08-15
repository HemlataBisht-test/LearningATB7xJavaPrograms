package July.ex_20072024;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program!");
        String browser_name = sc.next();
        switch (browser_name){
            case "Edge":
                System.out.println("Edge browser is starting");
                break;
            case "Chrome":
                System.out.println("Chrome browser is starting");
            case "FireFox":
                System.out.println("FireFox browser is starting");
            case "Safari":
                System.out.println("Safari browser is starting");
            default:
                System.out.println("No idea what browser it is");
                break;
        }
    }
}
