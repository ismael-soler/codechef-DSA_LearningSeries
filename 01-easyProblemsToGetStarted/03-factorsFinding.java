import java.util.*;

class FactorsFinding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        System.out.print(list.size() + " ");
        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}
