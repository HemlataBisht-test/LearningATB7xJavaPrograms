package August.ex_11082024.exCar;

class Car extends Engine{
    // Engine
    // GearBox
    // Keys
    // Tesla is A Car
    // Tesla - DRIVE()

    @Override
    void start() {
        System.out.println("Start the Car");

    }

    @Override
    void stop() {
        System.out.println("Stop the Car");

    }

    @Override
    void speed() {
        System.out.println("Car speed");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void openCar() {
        System.out.println("Open the Car with keys");
    }
}
