package Array03;

/* We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the
same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
(the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.


maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2 */

public class MaxMirror {
    public static int maxMirror(int[] nums) {
        int length = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                if (nums[j] == nums[i]) {
                    count = 1;
                    for (int k = i + 1; k < length; k++) {
                        if (j == 0)
                            break;
                        j--;
                        if (nums[k] == nums[j])
                            count++;
                        else
                            break;
                    }
                    max = Math.max(max, count);
                    //break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 4};
        System.out.println(maxMirror(a));
    }
}
