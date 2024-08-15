package July.ex_14072024;

public class Lab014 {
    public static void main(String[] args) {
        byte a= 10;
        byte b = 23;
        int c=a+b;    // byte + byte = int
        System.out.println(c);


        char d='A';
        char e= 'B';
        int f= d+e;     // char + char = int    Char converted in int due to ASCII code
        System.out.println(f);  // Ans will be (65 + 66= 131) in ASCII code A= 65 and B =66
        System.out.println(d==65);
        System.out.println(e ==66);
    }
}
