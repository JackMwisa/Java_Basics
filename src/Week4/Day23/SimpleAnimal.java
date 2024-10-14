package Week4.Day23;
import java.util.ArrayList;
import java.util.List;

public abstract class SimpleAnimal implements AnimalInteraction {
    protected List<String> interactionHistory = new ArrayList<>();

    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with: " + food);
    }

    @Override
    public void play() {
        interactionHistory.add("Played");
    }

    @Override
    public void showInteractionHistory() {
        for (String interaction : interactionHistory) {
            System.out.println(interaction);
        }
    }

    public void sleep(int hours) {
        interactionHistory.add("Slept for " + hours + " hours");
    }
}

