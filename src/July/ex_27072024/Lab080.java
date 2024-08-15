package July.ex_27072024;

import java.util.Arrays;

public class Lab080 {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        // Infosys Interview Question
        int[]salaries = {8,9,26,7,54,17,25};
        int max= salaries[0];
        int min=salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i]>=max){
                max=salaries[i];
            } if (min >salaries[i]){
                min=salaries[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
      //  Sort -> find the last one -  short method
       Arrays.sort(salaries);
        System.out.println(salaries[salaries.length-1]);

    }
}
