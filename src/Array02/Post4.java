package Array02;

/* Given a non-empty array of ints, return a new array containing the elements from the original array that come after
the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create
an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3] */

public class Post4 {
    public int[] post4(int[] nums) {
        int position = 0;
        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                position = i;
                break;
            }
        }
        int[] result = new int[length - 1 - position];
        for (int i = 0; i < length - 1 - position; i++) {
            result[i] = nums[position + 1 + i];
        }
        return result;
    }
}
