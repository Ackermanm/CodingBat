package Array02;

/* Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the
next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4 */

public class Sum67 {
    public static int sum67(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                sum += nums[i];
            } else {
                for (int j = i; j < nums.length; j++) {
                    if (j == nums.length - 1)
                        i = j;
                    else if (nums[j] == 7) {
                        i = j;
                        break;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(a));
    }
}
