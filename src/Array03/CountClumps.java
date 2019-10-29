package Array03;

/* Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1 */

public class CountClumps {
    public static int countClumps(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                count++;
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] == nums[i])
                        i++;
                    else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(a));
    }
}
