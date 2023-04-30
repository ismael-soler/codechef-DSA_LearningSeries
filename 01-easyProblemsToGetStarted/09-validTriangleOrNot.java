import java.util.*;

class validTriangleOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[3];

        for (int i = 0; i < 3; i++)
            myArray[i] = input.nextInt();
        Arrays.sort(myArray);

        if (myArray[0] + myArray[1] > myArray[2])
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
