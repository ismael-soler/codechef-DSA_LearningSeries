import java.util.*;

class reverseMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        int[] reversedArray = new int[arr.length];

        // load input into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // reverse the array
        for (int j = 0, i = arr.length - 1; j < arr.length; j++, i--) {
            reversedArray[j] = arr[i];
        }
        // print the reversed array
        for (int item : reversedArray)
            System.out.print(item + " ");

    }
}
