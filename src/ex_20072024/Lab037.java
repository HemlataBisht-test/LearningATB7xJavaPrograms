package ex_20072024;

public class Lab037 {
    public static void main(String[] args) {
        // New feature in switch case after JDK >13 (Java version 13 and above)
        int itemcode  = 003;
        switch (itemcode){
            case 004,005,006 :
                System.out.println("It is Electronic Gadget");
                break;
            case 007,008,009 :
                System.out.println("It is Machanical Gadget");
                break;
            case 001,002,003 :
                System.out.println("It is Electric Gadget");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
