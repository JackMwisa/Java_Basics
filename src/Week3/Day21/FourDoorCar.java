package Day21;

abstract class FourDoorCar implements Car {
    private String model;
    private int year;



    public FourDoorCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void openRoof();

    @Override
    public String toString() {
        return "FourDoorCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

