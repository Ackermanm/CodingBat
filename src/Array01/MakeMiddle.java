package Array01;

/* Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original
   array. The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2] */

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int l = nums.length;
        int[] result = {nums[l / 2 - 1], nums[l / 2]};
        return result;
    }
}
