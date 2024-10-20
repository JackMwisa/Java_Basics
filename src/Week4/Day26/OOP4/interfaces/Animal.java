package Week4.Day26.OOP4.interfaces;

public abstract class Animal {
    private double weight;

    public void eat(){
        System.out.println("Animal is eating");
    }

    public double getWeight() {
        return weight;
    }

    public abstract void breath();

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
