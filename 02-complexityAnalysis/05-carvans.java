import java.util.*;

class carvans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfTestCases = input.nextInt();

        while (nOfTestCases-- > 0) {
            int nOfCars = input.nextInt();
            int[] speeds = new int[nOfCars];
            int maxSpeedCounter = 0;

            // load car speed info into the array
            for (int i = 0; i < nOfCars; i++)
                speeds[i] = input.nextInt();

            for (int j = 0; j < speeds.length - 1; j++) {
                // if the can in front is not being limited then
                // max speed counter goes up by one
                int firstCarSpeed = speeds[j];
                int secondCarSpeed = speeds[j + 1];

                if (firstCarSpeed > secondCarSpeed) {
                    maxSpeedCounter += 1;
                } else if (firstCarSpeed < secondCarSpeed) {
                    speeds[j + 1] = speeds[j];
                }
            }
            System.out.println(maxSpeedCounter + 1);
        }
    }
}