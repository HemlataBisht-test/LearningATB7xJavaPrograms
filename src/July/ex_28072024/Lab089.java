package July.ex_28072024;

public class Lab089 {
    public static void main(String[] args) {
        //  Class - Attribute / properties - data Types - primitive or non primitive.
        // Class - Behaviour /Methods - functions -
        // object - real entity - class -
        // ClassName classRef = new ClassName();  //creating an object
        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using
     BuildingBP gaur = new BuildingBP();
     gaur.name = "Gaur city";
     gaur.colour ="Pink";
     gaur.lifts=2;
     gaur.address="Noida";
     gaur.noOfRooms=15;

     gaur.useLift();
     gaur.activities();

        BuildingBP ajnara = new BuildingBP();
        ajnara.name = "Ajnara Homes";
        ajnara.colour ="Pink";
        ajnara.lifts=2;
        ajnara.address="Noida";
        ajnara.noOfRooms=15;

        ajnara.activities();
        System.out.println(ajnara.name);
        System.out.println(gaur.name);
    }
}
