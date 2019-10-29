package Array02;

/* Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
You may modify and return the given array or make a new array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1] */

import java.util.Arrays;

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        int head = 0;
        int tail = length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                result[head] = 0;
                head++;
            } else {
                result[tail] = nums[i];
                tail--;
            }
        }

        return result;
    }
}
