package Array01;

/* Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
   The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5 */

public class MaxTripple {
    public int maxTriple(int[] nums) {
        int l = nums.length;
        int result = Math.max(nums[0], nums[l / 2]);
        result = Math.max(result, nums[l - 1]);
        return result;
    }
}
