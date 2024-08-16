package August.ex_10082024.SuperThisKeywords;

public class Lab113 {

}

class Student extends Person1{
    // is A relation - inheritance

    @Override
    void message() {
        System.out.println("I am Student message");
    }
void Display(){
        super.message();
}

}

class Person1{

    void message() {
        System.out.println("I am person message");
    }
}