package Day8;

public class WhileLoopsExample {
    public static void main(String[] args){
        // loops that stops only when finds number 10
        boolean notFound = true;
        int numOfItaration = 0;

        while (notFound){

            int randomNbr = (int) (Math.random() * 1000);
            System.out.println("Value: " + randomNbr);

            numOfItaration++;

            if(randomNbr == 10) {
                notFound = false;
                System.out.println("We looped " + numOfItaration + " times!");
            }
        }

    }
}
