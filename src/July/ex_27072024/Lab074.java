package July.ex_27072024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        //Array --> new
        int [] marks = new int[3];
        //index  0,1,2
        // length 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your marks :");
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] is_married = {true,false,true,false};
        for (int i=0; i<marks.length;i++){
            System.out.println(i  +" value :"+marks[i]);
        }
        String [] weekDays ={"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};
        for (int i=0;i<weekDays.length;i++){
            System.out.println(weekDays[i]);
        }

    }
}
