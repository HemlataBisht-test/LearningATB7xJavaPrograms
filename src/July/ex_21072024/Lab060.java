package July.ex_21072024;

public class Lab060 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==8){
                System.out.println("Hello break is here");
                break;   // break terminate the program execution and go outside the loop
            }
            System.out.println(i);

        }
    }
}
