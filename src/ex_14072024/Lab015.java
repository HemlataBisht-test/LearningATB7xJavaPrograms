package ex_14072024;

public class Lab015 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit means lossless (we are converting big data type in small data type so data loss)
        // Narrowing - Implicit, Explicit(with data type), loss

        //Widening
        byte b= 10;
        int c = b; // Valid Implicit Casting perform by JVM
        int c1 =(int)b;  // Valid Explicit Casting
        System.out.println(c);
        System.out.println(c1);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);
    }
}
