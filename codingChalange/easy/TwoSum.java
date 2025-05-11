package codingChalange.easy;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (targetSum == array[i] + array[j]) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}

