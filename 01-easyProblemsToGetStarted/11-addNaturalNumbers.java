import java.util.*;

class addNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totalSum = 0;

        for (long sum = input.nextInt(); sum > 0; sum--)
            totalSum+=sum;

        System.out.println(totalSum);

    }
}