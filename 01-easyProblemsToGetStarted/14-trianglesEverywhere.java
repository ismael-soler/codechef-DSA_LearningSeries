import java.util.*;

class trianglesEverywhere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            if (a == b & a == c)
                System.out.println("1");
            else if (a == b || b == c)
                System.out.println(2);
            else if (a != b || b != c)
            System.out.println(3);
        } else
            System.out.println(-1);
    }
}
