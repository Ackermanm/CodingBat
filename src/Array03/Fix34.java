package Array03;
/* Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately
followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2] */

import java.util.ArrayList;

public class Fix34 {
    public static int[] fix34(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if (nums[i] == 3) {
                result[i] = 3;
                i++;
                if (nums[i] == 4) {
                    result[i] = 4;
                } else {
                    result[i] = 4;
                    for (int j = i; j < length; j++) {
                        if (nums[j] == 4 && nums[j - 1] != 3)
                            result[j] = nums[i];
                    }
                }
            } else if (nums[i] == 4) {
                continue;
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 1, 3, 4, 4};
        System.out.println(fix34(a));
    }
}
