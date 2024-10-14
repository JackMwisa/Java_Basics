package Week2.Day8;

public class ForEachLoopsEx {
    public static void main(String[] args) {
        int[] nrs = {61,32,3,4,15,6,77,18,9,10};

        int sum = 0;
        for (int num : nrs){
            System.out.println(num);
            sum += num;
        }

        System.out.println("The sum of all numbers is: " + sum);
    }
}
