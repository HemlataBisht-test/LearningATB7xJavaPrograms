package ex_21072024;

public class Lab068 {
    public static void main(String[] args) {
        int i=10;
        while (i<10){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);   // in do while i value print 1 time without checking any condition.
            i++;
        }while (i<10);
    }
}
