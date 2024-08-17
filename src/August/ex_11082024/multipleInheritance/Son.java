package August.ex_11082024.multipleInheritance;

public class Son implements Father,Mother{
    @Override
    public void money() {
        System.out.println("This is only one function after implement both");
    }

    @Override
    public void home() {

    }
}
