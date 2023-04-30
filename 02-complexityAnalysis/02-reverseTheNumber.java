import java.util.*;

class reverseTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-- > 0) {
            int reversedNumber = 0;
            for (int n = input.nextInt(); n > 0; n /= 10)
                reversedNumber = (reversedNumber * 10) + (n % 10);
            System.out.println(reversedNumber);
        }
    }
}
