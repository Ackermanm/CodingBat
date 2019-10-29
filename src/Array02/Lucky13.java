package Array02;

/* Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false */

public class Lucky13 {
    public static boolean lucky13(int[] nums) {
        int count = 0;

        for (int a : nums) {
            if (a == 1 || a == 3)
                count++;
        }

        if (count > 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 4};
        System.out.println(lucky13(a));
    }
}
