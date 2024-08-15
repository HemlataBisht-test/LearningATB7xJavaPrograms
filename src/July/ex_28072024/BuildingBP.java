package July.ex_28072024;

public class BuildingBP {
   String name;
   String colour;
   String address;
   int noOfRooms = 12;
   int lifts;

   void useLift(){
       System.out.println("I am using the lift : "  +name);
   }
   void activities(){
       System.out.println("I am doing some activities : " +name);
   }
}
