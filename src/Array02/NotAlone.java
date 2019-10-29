package Array02;

/* We'll say that an element in an array is "alone" if there are values before and after it, and those values are different
from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever
value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4] */

public class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        int length = nums.length;
        if (length == 0)
            return nums;
        int[] result = new int[length];
        for (int i = 1; i < length - 1; i++) {
            if (nums[i] == val) {
                if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i])
                    result[i] = Math.max(nums[i - 1], nums[i + 1]);
                else
                    result[i] = nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        result[0] = nums[0];
        result[length - 1] = nums[length - 1];

        return result;
    }
}
