import java.util.*;

class rangeOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int r = input.nextInt();
        //ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0){
                if (i == r || i + 1 == r)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
