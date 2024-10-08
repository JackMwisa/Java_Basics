package Day19.Question3;

public class Main {
    public static void main(String[] args) {


        FourDoorCar car1 = new FourDoorToyota("Toyota Camry", "Camry", 30000, 240, 50, 2020, 15000, 200);
        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.stop();

        TwoDoorCar car2 = new TwoDoorBMW("BMW M4", "M4", 80000, 280, 60, 2021, 10000, 400);
        car2.start();
        car2.accelerate();
        car2.brake();
        car2.stop();

        // Call sell() method for both cars
        car1.sell();
        car2.sell();
    }
}

interface Car {
    void start();
    void stop();
    void accelerate();
    void brake();

    double sell();

}

abstract class FourDoorCar implements Car {
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    int year;
    double mileage;
    double power;

    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.speed = 0;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }

    @Override
    public double sell() {
        double sellingPrice = (power / (mileage * year)) * 10000000;
        if (sellingPrice < 0) {
            sellingPrice = 0;
        }
        System.out.println(name + " Selling price: $" + sellingPrice);
        return sellingPrice;
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
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
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
    double mileage;
    double power;
    int year;

    public TwoDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity, double mileage, double power, int year) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.speed = 0;
        this.mileage = mileage;
        this.power = power;
        this.year = year;
    }

    @Override
    public double sell() {
        double sellingPrice = (power / (mileage * year)) * 10000000;

        if (sellingPrice < 0) sellingPrice = 0;
        System.out.println(name + " Selling price: $" + sellingPrice);
        return sellingPrice;
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
                ", mileage=" + mileage +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}

class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    @Override
    public String toString() {
        return "FourDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    @Override
    public String toString() {
        return "FourDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorFord extends FourDoorCar {
    public FourDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    @Override
    public String toString() {
        return "FourDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

class FourDoorHyundai extends FourDoorCar {
    public FourDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    @Override
    public String toString() {
        return "FourDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

// Concrete Classes for TwoDoorCar
class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, (double) year, mileage, (int) power);
    }

    @Override
    public String toString() {
        return "TwoDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", mileage=" + mileage +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}

class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, (double) year, mileage, (int) power);
    }

    @Override
    public String toString() {
        return "TwoDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", mileage=" + mileage +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}

class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, (double) year, mileage, (int) power);
    }

    @Override
    public String toString() {
        return "TwoDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", mileage=" + mileage +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}

class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity, int year, double mileage, double power) {
        super(model, name, price, maxSpeed, fuelCapacity, (double) year, mileage, (int) power);
    }

    @Override
    public String toString() {
        return "TwoDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", mileage=" + mileage +
                ", power=" + power +
                ", year=" + year +
                '}';
    }
}