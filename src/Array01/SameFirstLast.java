package Array01;

/* Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true */

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        int length = nums.length;

        if (length >= 1) {
            if (nums[0] == nums[length-1])
                return true;
            else return false;
        }

        return false;
    }
}
