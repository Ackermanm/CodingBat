package Array01;

/* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.


firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false */

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        int l = nums.length;

        if (nums[0] == 6 || nums[l-1] == 6)
            return true;

        return false;
    }
}
