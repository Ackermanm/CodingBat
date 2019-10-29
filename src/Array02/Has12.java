package Array02;

/* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true */

public class Has12 {
    public boolean has12(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int a : nums) {
            if (a == 1)
                count1++;
        }
        for (int a : nums) {
            if (a == 2)
                count2++;
        }
        if (count1 == 0 || count2 == 0)
            return false;

        int place1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                place1 = i;
                break;
            }
        }
        int place2 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 2) {
                place2 = i;
                break;
            }
        }
        if (place1 < place2)
            return true;
        else
            return false;
    }
}
