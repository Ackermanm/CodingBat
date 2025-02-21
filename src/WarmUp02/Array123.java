package WarmUp02;

/* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true */

import java.util.Arrays;

public class Array123 {
    public boolean array123(int[] nums) {
        String string = nums.toString();
        int[] check = {1, 2, 3};
        boolean checker = false;
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                checker = true;
        }
        return checker;
    }
}
