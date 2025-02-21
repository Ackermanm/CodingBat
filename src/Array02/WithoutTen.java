package Array02;

/* Return a version of the given array where all the 10's have been removed. The remaining elements should shift left
towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
You may modify and return the given array or make a new array.


withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0] */

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int head = 0;
        int tail = length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 10) {
                result[tail] = 0;
                tail--;
            } else {
                result[head] = nums[i];
                head++;
            }
        }

        return result;
    }
}
