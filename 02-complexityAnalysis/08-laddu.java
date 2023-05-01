import java.util.*;

class laddu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfTests = input.nextInt();

        while (nOfTests-- > 0) {
            int nOfActivities = input.nextInt();
            //input.nextLine();
            // 0 indian, 1 not indian
            int origin = 0;
            int totalSum = 0;

            if (input.next().equals("NON_INDIAN"))
                origin = 1;

            while (nOfActivities-- > 0) {
                String currentActivity = input.next().trim();

                if (currentActivity.equals("CONTEST_WON")) {
                    int rank = input.nextInt();
                    if (rank < 20)
                        totalSum += 300 + 20 - rank;
                    else
                        totalSum += 300;
                    input.nextLine();
                }
                else if (currentActivity.equals("TOP_CONTRIBUTOR")) {
                    totalSum += 300;
                }
                else if (currentActivity.equals("BUG_FOUND")) {
                    totalSum += input.nextInt();
                    input.nextLine();
                }
                else if (currentActivity.equals("CONTEST_HOSTED")) {
                    totalSum += 50;
                }
            }

            if (origin == 1)
                System.out.println(totalSum / 400);
            else
                System.out.println(totalSum / 200);

        }
    }

}
