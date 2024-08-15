package August.ex_10082024.ecap;
//## Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.
public class ICICIBank {
    private String name;
    private long balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isAdmin) {
        if (isAdmin){
            System.out.println("You can edit the name");
            this.name = name;
        }else {
            System.out.println("Not Allowed");
        }

    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if (isAdmin) {
            System.out.println("you can add the balance");
            this.balance = balance;
        }else {
            System.out.println("Not Allowed");
        }
    }
}
