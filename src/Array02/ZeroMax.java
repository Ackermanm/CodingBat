package Array02;

/* Return a version of the given array where each zero value in the array is replaced by the largest odd value to the
right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0] */

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = largestOdd(i, nums);
            } else
                result[i] = nums[i];
        }
        return result;
    }

    public int largestOdd(int index, int[] array) {
        int max = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] % 2 == 1 && array[i] > max)
                max = array[i];
        }
        return max;
    }
}
