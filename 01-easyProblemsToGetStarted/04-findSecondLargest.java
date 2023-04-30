import java.util.*;

class findSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 0; i < 3; i++)
            sortedSet.add(input.nextInt());
        sortedSet.remove(sortedSet.first());
        System.out.println(sortedSet.first());
    }
}
