import java.util.*;

class IsBothOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 5 == 0 & n % 11 == 0) {
            System.out.println("BOTH");
        }
        else if (n % 5 == 0 || n % 11 == 0) {
            System.out.println("ONE");
        } else {
            System.out.println("NONE");
        }
    }
}
