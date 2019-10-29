package Array02;

/* Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true */

public class ModThree {
    public boolean modThree(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((isEven(nums[i]) && isEven(nums[i + 1]) && isEven(nums[i + 2])) || (!isEven(nums[i]) && !isEven(nums[i + 1]) && !isEven(nums[i + 2]))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
}
