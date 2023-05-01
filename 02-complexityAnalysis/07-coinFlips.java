import java.util.*;

class coinFlips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfTests = input.nextInt();

        while (nOfTests-- > 0) {
            int nOfGames = input.nextInt();
            while (nOfGames-- > 0){
                int initialState = input.nextInt();
                int nOfCoins = input.nextInt();
                int sideToGuess = input.nextInt();

                if (initialState == sideToGuess){
                    System.out.println(nOfCoins / 2);
                } else {
                    System.out.println(nOfCoins - (nOfCoins / 2));
                }
            }
        }

    }
}

// T H H H
// H T H H
// T H T H
// H T H T

// T H H H H
// H T H H H
// T H T H H
// H T H T H
// T H T H T