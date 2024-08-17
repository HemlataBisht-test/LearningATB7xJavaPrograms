package August.ex_17082024;

public class Lab131 {
    public static void main(String[] args) {
        // Anonymous Class
        ABC a= new ABC() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");

            }
        };
        DEF b =new DEF() {
            @Override
            void m3() {
                System.out.println(" Encapsulation method m3");
            }
        };
    }
}
interface ABC{
    void m1();
    void m2();
}
abstract class DEF{
    abstract void m3();

}
