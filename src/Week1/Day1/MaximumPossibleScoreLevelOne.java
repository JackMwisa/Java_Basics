package Week1.Day1;

public class MaximumPossibleScoreLevelOne {
    public static void main(String[] args) {
        int maxScore = 500;
        int playerScore = 453;

        // percentage
        float percentage = (float) playerScore / (maxScore / 100);

        System.out.println("My Percentage: " + percentage);
    }
}
