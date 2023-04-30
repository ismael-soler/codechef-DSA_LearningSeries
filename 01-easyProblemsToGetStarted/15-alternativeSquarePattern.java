import java.util.*;

class alternativeSquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] oneToFive = new int[] {1, 2, 3, 4, 5};
        int[] reverser = new int[] {4, 2, 0, -2, -4};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((5 * i) + oneToFive[j] + (i % 2) * reverser[j] + " ");
            }
            System.out.println("");

        }


    }
}
