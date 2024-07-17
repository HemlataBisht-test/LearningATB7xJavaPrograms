package ex_14072024;

public class Lab020 {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "World !";
        String str3= "Hello World !";
        String str4= str1 + str2;
        String str5= str1.concat(str2);
        System.out.println(str4);
        System.out.println(str4);
        System.out.println(str4.equals(str5));  // Check for the Content
        System.out.println(str4==str5);    // Check for the Ref
    }
}
