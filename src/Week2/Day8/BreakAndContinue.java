package Week2.Day8;

public class BreakAndContinue {
    public static void main(String[] args) {
        int[] nrs = {1,2,3,4,5,6,7,8,9,10};

        for (int nr: nrs) {

            if (nr % 2 == 0){
                continue;
            }
            System.out.println(nr);
        }
    }
}
