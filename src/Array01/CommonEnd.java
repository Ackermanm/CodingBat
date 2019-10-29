package Array01;

/* Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true */

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        int l1 = a.length;
        int l2 = b.length;

        if (a[0] == b[0] || a[l1-1] == b[l2-1])
            return true;
        else return false;
    }
}
