import java.util.*;

class BuyPlease {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] = input.nextInt();
        }
        int res = (arr[0] * arr[2]) + (arr[1] * arr[3]);
        System.out.println(res);
    }
}
