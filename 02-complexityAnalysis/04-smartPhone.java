import java.util.*;

class smartPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfBuyers = input.nextInt();
        long largestRev = 0;
        long[] budgets = new long[nOfBuyers];

        for (int j = 0; j < nOfBuyers; j++)
            budgets[j] = input.nextInt();

        Arrays.sort(budgets);
        for (int i = 0; i < nOfBuyers; i++) {
            long currentRev = budgets[i] * (nOfBuyers - i);

            if (currentRev > largestRev)
                largestRev = currentRev;
        }
        System.out.println(largestRev);
    }
}
