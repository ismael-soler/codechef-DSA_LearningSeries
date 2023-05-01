import java.math.BigDecimal;
import java.util.*;

class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timesToRun = input.nextInt();

        while (timesToRun-- > 0) {
            long n = input.nextLong();
            long nOfTrailingZeros = 0;
            long magicNumber = 5;

            while (magicNumber <= n){
                nOfTrailingZeros += (n / magicNumber);
                n /= 5;
            }
            System.out.println(nOfTrailingZeros);

        }



    }
}
