package ex_27072024;

public class Lab081 {
    public static void main(String[] args) {
        int[] salaries = {12, 8, 4, 15, 25, 9, 30, 34, 6};
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
            max = salaries[i];

        }if (min >salaries[i]) {
            min =salaries[i];

        }
        System.out.println(max);
        System.out.println(min);
    }
}
}
