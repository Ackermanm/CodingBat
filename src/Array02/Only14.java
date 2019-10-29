package Array02;

/* Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true */

public class Only14 {
    public boolean only14(int[] nums) {
        boolean flag = true;
        for (int a : nums) {
            if (a != 1 && a != 4) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
