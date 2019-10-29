package Array01;

/* Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false */

public class No23 {
    public boolean no23(int[] nums) {
        boolean checker = true;

        for (int a : nums) {
            if (a == 2 || a == 3)
                checker = false;
        }

        return checker;
    }
}
