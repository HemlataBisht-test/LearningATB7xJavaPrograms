package August.ex_11082024.exCar;

public class WagonR extends Engine{
    void drive() {
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

        @Override
    void start() {
        System.out.println("Start the WagonR");
    }

    @Override
    void stop() {
        System.out.println("stop the WagonR");

    }

    @Override
    void speed() {
        System.out.println("speed of WagonR is 1000/km");
    }

    @Override
    void partGearBox() {
        System.out.println("GearBox of WagonR");
    }

    @Override
    void openCar() {
        System.out.println("Open the WagonR");
    }
}
