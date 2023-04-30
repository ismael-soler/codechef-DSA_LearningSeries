import java.util.*;

class trianglesWithAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == 0 || b == 0 || c == 0)
            System.out.println("NO");
        else if (a + b + c == 180)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
