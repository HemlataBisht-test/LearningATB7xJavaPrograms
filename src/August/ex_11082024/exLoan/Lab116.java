package August.ex_11082024.exLoan;

public class Lab116 {
    public static void main(String[] args) {
        Son s=new Son();
        s.loan50K();
        // we can't create Father object because abstract class don't have any objects.
        Father f=new Son();  // This is called Dynamic Dispatch
        f.loan25K();
        f.loan50K();
    }
}
