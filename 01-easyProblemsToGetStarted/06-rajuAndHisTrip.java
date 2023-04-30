import java.util.*;

class rajuAndHisTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 5 == 0 || n % 6 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
