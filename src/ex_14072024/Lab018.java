package ex_14072024;

public class Lab018 {
    public static void main(String[] args) {
        int a = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b);  // KKVV8791
        System.out.println(s1+s2+(a+b)); //KKVV178
        System.out.println(a+b+s1+s2); //178KKVV
        //System.out.println(KK+vv+87+91);  //
    }
}
