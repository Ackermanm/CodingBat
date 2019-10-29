package Array02;

/* Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers
come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array,
or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2] */

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int head = 0;
        int tail = length - 1;
        for (int i = 0; i < length; i++) {
            if (nums[i] % 2 == 0) {
                result[head] = nums[i];
                head++;
            } else {
                result[tail] = nums[i];
                tail--;
            }
        }

        return result;
    }
}
