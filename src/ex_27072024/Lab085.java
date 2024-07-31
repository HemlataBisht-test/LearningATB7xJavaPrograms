package ex_27072024;

public class Lab085 {
    public static void main(String[] args) {
        int [] salaries = {6,9,12,5,25,32};
        int max =salaries[0];
        for (int i=0;i<(salaries.length)-1;i++){
            if (salaries[i]>max);
            max= salaries[i];
        }
        System.out.println(max);
    }
}
