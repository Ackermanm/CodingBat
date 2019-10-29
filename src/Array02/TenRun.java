package Array02;

/* For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering
another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20] */

import java.util.ArrayList;

public class TenRun {
    public static int[] tenRun(int[] nums) {
        int length = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i] % 10 == 0)
                list.add(i);
        }
        if (list.size() == 0)
            return nums;
        int[] array = new int[length];
        for (int i = 0; i < list.get(0); i++) {
            array[i] = nums[i];
        }
        for (int i = list.get(list.size() - 1); i < length; i++) {
            array[i] = nums[list.get(list.size() - 1)];
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.get(i); j < list.get(i + 1); j++) {
                array[j] = nums[list.get(i)];
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] a = {2, 10, 3, 4, 20, 5};
        System.out.println(tenRun(a));
    }
}
