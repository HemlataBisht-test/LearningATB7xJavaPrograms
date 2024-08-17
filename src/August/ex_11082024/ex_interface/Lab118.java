package August.ex_11082024.ex_interface;

public class Lab118 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.


    public static void main(String[] args) {
//        Engine e = new Engine();    we can not create an object of Interface
        WagonR r = new WagonR();
        r.drive();
    }
}
