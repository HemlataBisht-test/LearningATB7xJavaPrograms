package August.ex_10082024.SuperThisKeywords;

public class Lab114 {
    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName



}

class Person2 {
    Person2() {
        System.out.println("Person1 - DC");
    }

    Person2(String a) {
        System.out.println("Person1 - PC A1");
    }

    Person2(String a, int a1) {
        System.out.println("Person1  - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;
    Student1(String s){
        System.out.println("PC -Student");
    }

    Student1(){
        super();
        System.out.println(this.a);
        //super("Pramod");
        //super("pramod",12);
    }

}
