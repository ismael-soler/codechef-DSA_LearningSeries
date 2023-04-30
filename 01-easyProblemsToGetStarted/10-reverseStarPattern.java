import java.util.Scanner;

class reverseStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int line = 0; line <= n - 1; line++){
            for (int nOfSpaces = 0; nOfSpaces < n - line - 1; nOfSpaces++) {
                System.out.print(" ");
            }
            for (int nOfStars = 0; nOfStars <= line; nOfStars++){
                if (nOfStars == line)
                    System.out.println("*");
                else
                    System.out.print("*");
            }
        }
    }
}
