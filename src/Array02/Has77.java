package Array02;

/* Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated
by one element, such as with {7, 1, 7}.


has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false */

import java.util.ArrayList;

public class Has77 {
    public boolean has77(int[] nums) {
        ArrayList<Integer> l = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 7)
                l.add(i);
        }
        boolean flag = false;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) - l.get(i - 1) <= 2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
