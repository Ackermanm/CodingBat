package Array02;

/* Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true */

public class No14 {
    public boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int a : nums) {
            if (a == 1)
                count1++;
        }
        for (int a : nums) {
            if (a == 4)
                count4++;
        }

        if (count1 == 0 || count4 == 0)
            return true;
        else
            return false;
    }
}
