package ex_27072024;

public class Lab073 {
    public static void main(String[] args) {
        int []marks = {98,67,93,67,45};
        // elements are fixed.
        // len -> 5
        // index always starts from 0
        System.out.println(marks.length);   //5
        System.out.println(marks[3]);     //67
        System.out.println(marks[0]);    //98
        System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException
        System.out.println(marks[10]);   //Index 10 out of bounds for length
    }
}
