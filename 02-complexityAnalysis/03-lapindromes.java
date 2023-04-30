import java.util.*;

class lapindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfTests = input.nextInt();
        int l = 0, r = 0;
        ArrayList<Character> left;
        ArrayList<Character> right;

        input.nextLine();
        while (nOfTests-- > 0) {
            left = new ArrayList<>();
            right = new ArrayList<>();
            String currentWord = input.nextLine();

            for (l = 0, r = currentWord.length() - 1; l < r; l++, r--) {
                left.add(currentWord.charAt(l));
                right.add(currentWord.charAt(r));

            }

            Collections.sort(left);
            Collections.sort(right);
            if (left.equals(right))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
