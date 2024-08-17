package August.ex_17082024;

public class Lab127 {
    public static void main(String[] args) {
        A a =new A();
        A a2=new A();
        a.product=12;
        A.m1();  // Static method - we can access static method with class name. and it's called when class is loaded
        System.out.println(A.discount);
        a.m2();
        // Static don't need object ref. - True
    }
}



class  A{
    int product =10;
    static int discount = 199;

    static {
        System.out.println("One Time Load SIB ");
    }
    //IIB - instance initialization block
    {
        System.out.println("IIB when Object is created ");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount);
    }

        }
