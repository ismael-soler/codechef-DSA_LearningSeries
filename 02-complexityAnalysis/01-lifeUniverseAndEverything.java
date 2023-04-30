import java.util.*;

class lifeUniverseAndEverything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        while(true) {
            n = input.nextInt();
            if (n == 42)
                break;
            System.out.println(n);
        }
    }
}
