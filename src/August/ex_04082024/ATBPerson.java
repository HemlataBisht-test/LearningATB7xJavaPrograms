package August.ex_04082024;

public class ATBPerson {
    long phone;
    String name;

    // DC
    ATBPerson() {
        System.out.println("Object is created!");
    }

    ATBPerson(String nameGiven){
        this.name = nameGiven;
        // this keyword means current class.
    }

    ATBPerson(String nameGiven,long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}
