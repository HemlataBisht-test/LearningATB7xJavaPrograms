package ex_14072024;

public class Lab017 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // (++a)Pre and (a++)Post
        // pre - increment ++operand
        // value is incremented first and then stored in the result.

        int a=10;

        // POST
        //  value is stored in the result and incremented later

       // System.out.println(++a + a++ + a++); // 11+11+12 = 34

          System.out.println(a++ + ++a + ++a);    //10+12+13 =35
    }
}
