package codingChalange.easy;

import java.util.*;

public class ValidateSequence {
    //  {
//   "array": [5, 1, 22, 25, 6, -1, 8, 10],
//   "sequence": [1, 6, -1, 5]
// }
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        if (array.size() < sequence.size()) {
            return false;
        }
        int arrIdx = 0;
        int seqIdx = 0;
        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx) == sequence.get(seqIdx)) {
                seqIdx += 1;
            }
            arrIdx += 1;
        }

        return seqIdx == sequence.size();
    }
}

