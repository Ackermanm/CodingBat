package Array03;

/* Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear
in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays
are already in sorted order.


linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true */

import java.util.ArrayList;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        ArrayList<Integer> outerList = new ArrayList<>();
        ArrayList<Integer> innerList = new ArrayList<>();
        for (int a : outer)
            outerList.add(a);
        boolean flag = true;
        for (int i = 0; i < inner.length; i++) {
            if (!outerList.contains(inner[i])) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
