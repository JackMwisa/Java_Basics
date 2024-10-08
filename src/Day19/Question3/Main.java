package Day19.Question3;

public class Main {
    public static void main(String[] args) {

        FourDoorCar car1 = new FourDoorToyota("Toyota Camry", "Camry", 30000, 240, 50);
        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.stop();

        TwoDoorCar car2 = new TwoDoorBMW("BMW M4", "M4", 80000, 280, 60);
        car2.start();
        car2.accelerate();
        car2.brake();
        car2.stop();
    }
}

interface Car {
    void start();
    void stop();
    void accelerate();
    void brake();
}

abstract class FourDoorCar implements Car {
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;

    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.speed = 0;
    }

    @Override
    public void start() {
        speed = 0;
        System.out.println(name + " Starting at " + speed + " km/h");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name + " Stopping at " + speed + " km/h");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name + " Accelerating to " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;
        System.out.println(name + " Braking to " + speed + " km/h");
    }

    @Override
    public String toString() {
        return "FourDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}

abstract class TwoDoorCar implements Car {
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;

    public TwoDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.speed = 0;
    }

    @Override
    public void start() {
        speed = 0;
        System.out.println(name + " Starting at " + speed + " km/h");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name + " Stopping at " + speed + " km/h");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name + " Accelerating to " + speed + " km/h");
    }

    @Override
    public void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;
        System.out.println(name + " Braking to " + speed + " km/h");
    }

    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}

// Concrete Classes for FourDoorCar
class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

// Concrete Classes for TwoDoorCar
class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}
