package AP01;

/* We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive
ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate
isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.


copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1] */

import java.util.ArrayList;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (isEndy(i))
                list.add(i);
        }
        for (int i = 0; i < count; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    boolean isEndy(int n) {
        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100))
            return true;
        else
            return false;
    }
}
