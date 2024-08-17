package August.ex_17082024;

public class Lab126 {
    public static void main(String[] args) {
        Double d=3.14; // Wrappen classes create memory in HEAP
        double value = d.doubleValue();  //CM
        System.out.println(d);
        System.out.println(value);

        String s1= "Hello";    // SCP - String constant pool
        String s2 = new String("Hello");   // Heap memeory

    }
}
