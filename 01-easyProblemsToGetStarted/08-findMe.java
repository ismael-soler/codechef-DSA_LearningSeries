import java.util.*;

class findMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        int searchedNumber = input.nextInt();

        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();

        for (int current : arr){
            if (current == searchedNumber){
                System.out.println("1");
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}
