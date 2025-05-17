package codingChalange.easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {

        if (coins.length == 0) {
            return 1;
        }

        Arrays.sort(coins);

        int minChange = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > minChange + 1) {
                break;
            }
            minChange += coins[i];
        }
        return minChange + 1;
    }
}


