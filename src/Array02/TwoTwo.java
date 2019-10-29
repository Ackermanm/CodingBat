package Array02;

/* Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false */

import java.util.ArrayList;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                l.add(i);
        }
        if (l.size() == 1)
            return false;
        boolean flag = true;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) - l.get(i - 1) != 1) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
