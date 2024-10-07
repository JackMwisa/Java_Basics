package Day21;

abstract class TwoDoorCar implements Car {
    private String model;
    private int year;


    public TwoDoorCar(String model, int year) {
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

}


