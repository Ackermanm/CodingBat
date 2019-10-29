package Array02;

/* Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array,
or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1] */

public class ShifLeft {
    public int[] shiftLeft(int[] nums) {
        int length = nums.length;
        if (length == 0)
            return nums;
        int[] array = new int[length];
        for (int i = 0; i < length - 1; i++) {
            array[i] = nums[i + 1];
        }
        array[length - 1] = nums[0];

        return array;
    }
}
