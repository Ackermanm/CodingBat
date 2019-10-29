package AP01;

/* Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original
array. The original array will contain at least "count" even numbers.


copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4] */

import java.util.ArrayList;

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] array = new int[count];
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : nums) {
            if (a % 2 == 0)
                list.add(a);
        }
        for (int i = 0; i < count; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
