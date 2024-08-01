package ex_28072024;

public class Lab090 {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.name ="Libra";
        dog.age=5;
        dog.breed= "XYZ";
        dog.color= "Brown";

        dog.walk();
        dog.eat();
        System.out.println(" Dog details are : "+dog.name);
    }
}
