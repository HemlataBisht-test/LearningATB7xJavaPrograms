package August.ex_10082024.ecap;

public class Lab109 {
    public static void main(String[] args) {
        // set the balance
        // admin

        // amit.name = "dasdd";
        ICICIBank amit=new ICICIBank("Amit",6000);
        amit.setBalance(1998888,false);
        System.out.println(amit.getBalance());
        System.out.println(amit.getName());

        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBalance(129288,true);
        System.out.println(admin.getBalance());
        System.out.println(admin.getName());


    }
}
