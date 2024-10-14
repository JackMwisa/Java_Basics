package Week4.Day25;

import java.util.ArrayList;

public abstract class SimpleAnimal implements AnimalInteraction {
    ArrayList<String> interactionHistory = new ArrayList<>();
    protected String animalType;

    public SimpleAnimal(String animalType) {
        this.animalType = animalType;
    }


    @Override
    public void feed(String food) {
        interactionHistory.add(animalType + " was fed with: " + food);
    }

    @Override
    public void play() {
        interactionHistory.add(animalType + " played");
    }

    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction History of " + animalType + ":");
        for (String interaction : interactionHistory) {
            System.out.println("- " + interaction);
        }
    }


//    @Override
//    public void feed(String food) {
//
//    }
//
//    @Override
//    public void play() {
//
//    }
//
//    @Override
//    public void showInteractionHistory() {
//
//    }

    public void sleep(int hours) {
        interactionHistory.add(animalType + " slept for " + hours + " hours");
    }
}