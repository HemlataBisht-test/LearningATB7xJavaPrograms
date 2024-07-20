package ex_20072024;

public class Lab041 {
    public static void main(String[] args) {
        int itemcode =003;
        switch (itemcode){
            case 001 -> System.out.println("this is a laptop");
            case 002 -> System.out.println("this is a desktop");
            case 003 -> System.out.println("this is a mobile");
            default -> System.out.println("Hello");
        }
    }
}
