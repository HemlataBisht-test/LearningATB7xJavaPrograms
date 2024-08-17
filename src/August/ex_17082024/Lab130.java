package August.ex_17082024;

public class Lab130 {
    public static void main(String[] args) {
    Car c=new Car("Nexon");
    c.drive();
        // to access the inner class Object creation.
        Car.GearBox cg= c.new GearBox();
        cg.m2();

    }
}
class Car{
    private String make;

    public Car(String make) {
        this.make = make;
    }

    //method
    void drive(){
        System.out.println("you can drive a Car");
    }
    class GearBox{
        void m2() {
            System.out.println("m2");
        }
        class NutBolts{

        }
    }
}