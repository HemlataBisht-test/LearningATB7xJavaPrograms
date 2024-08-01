package ex_28072024;

public class Lab088 {
    public static void main(String[] args) {
        // OOPs - Concept
        // Real life problem -> OOPs concepts
        // Creating - New planet
        //  AHuman - below we are defining the properties of that
        //  Attributes / properties -> 2 hand, eye color, node, mouth, height, wieght, body color, hair color
        // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().

        // Amit - AHuman
        // A ->  Amit
        // B ->
        //  Blueprint - Class - Person

        Person person=new Person();  // real time object
        person.Name = "Priya";
        person.age=25;
        person.colour= "Fair";
        person.gender="Girl";
        person.rollno=1;

        Person person2= new Person();
        person.Name = "Rahul";
        person.age=30;
        person.colour= "Brown";
        person.gender="Boy";
        person.rollno=2;

        System.out.println(person.Name);
        System.out.println(person.age);
        System.out.println(person.colour);
        System.out.println(person.gender);
        System.out.println(person.rollno);



    }
}
