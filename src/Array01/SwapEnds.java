package Array01;

/* Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.


swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8] */

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int l = nums.length;
        int head = nums[0];
        int tail = nums[l - 1];
        nums[0] = tail;
        nums[l-1] = head;
        return nums;
    }
}
