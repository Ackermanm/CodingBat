package Array03;

/* (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as
the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number
may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version,
5's may appear anywhere in the original array.


fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5] */

import java.util.ArrayList;

public class Fix45 {
    public static int[] fix45(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        ArrayList<Integer> position4 = new ArrayList<>();
        //ArrayList<Integer> position5 = new ArrayList<>();
        ArrayList<Integer> positionOther = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] == 4)
                position4.add(i);
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] != 4 && nums[i] != 5)
                positionOther.add(i);
        }
        for (int i : position4) {
            result[i] = 4;
            result[i + 1] = 5;
        }
        int flag = 0;
        for (int i = 0; i < length; i++) {
            if (result[i] == 0) {
                result[i] = nums[positionOther.get(flag)];
                flag++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 9, 4, 9, 5};
        System.out.println(fix45(a));
    }
}
