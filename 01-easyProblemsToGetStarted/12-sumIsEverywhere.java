import java.util.*;

class sumIsEverywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long oddSum = 0;
        long evenSum = 0;


        for (long i = 1; i <= n * 2; i++) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println(oddSum + " " + evenSum);
    }
}