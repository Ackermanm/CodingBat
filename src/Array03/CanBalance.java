package Array03;

/* Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side
is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true */

import java.util.ArrayList;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        int length = nums.length;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < length - 1; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            left.add(sum);
        }
        for (int i = length - 1; i > 0; i--) {
            int sum = 0;
            for (int j = length - 1; j >= i; j--) {
                sum += nums[j];
            }
            right.add(sum);
        }
        boolean flag = false;
        for (int i = 0; i < left.size(); i++) {
            if (left.get(i) == right.get(right.size() - 1 - i)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
