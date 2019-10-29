package Array02;

/* Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false */

import java.util.ArrayList;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int a : nums) {
            if (a == 3)
                count++;
        }

        if (count == 3) {
            boolean flag = true;
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 3) {
                    l.add(i);
                }
            }
            for (int i = 1; i < 3; i++) {
                if (l.get(i) - l.get(i - 1) != 2) {
                    flag = false;
                    break;
                }
            }

            return flag;
        } else
            return false;
    }
}
