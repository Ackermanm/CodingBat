package Array01;

/* Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false */


public class Has23 {
    public boolean has23(int[] nums) {
        boolean checker = false;

        for (int a : nums) {
            if (a == 2 || a == 3) {
                checker = true;
            }
        }

        return checker;
    }
}
