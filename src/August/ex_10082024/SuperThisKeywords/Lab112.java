package August.ex_10082024.SuperThisKeywords;

public class Lab112 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.
    public void main(String[] args) {
    Car c=new Car();
    c.display();
    }
    class Car extends Vehical{
        private int maxSpeed =281;
        Car(){
            super(10);  // constructor changing
            System.out.println("DC car");
        }
        public void display(){
            System.out.println("Car speed is -> "+ this.maxSpeed);
            System.out.println("Vehicle speed is -> "+ super.maxSpeed);
            super.message();
            this.message();

        }
        @Override
        void message(){
            System.out.println("Hello vehical");
        }


    }
    class Vehical {
        public int maxSpeed = 180;
        Vehical(){
            System.out.println("Default Vehical");
        }
        Vehical(int a){
            System.out.println("Parameterized Vehical");
        }
        void message(){
            System.out.println("Hello vehical");
        }
        void message(int a){
            System.out.println("Hello vehical");
        }

    }
}
