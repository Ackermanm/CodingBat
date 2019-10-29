package Array01;

/* Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array
   is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1] */

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            int[] r1 = {};
            return r1;
        } else if (a.length == 0 && b.length != 0) {
            int[] r2 = {b[0]};
            return r2;
        } else if (a.length != 0 && b.length == 0) {
            int[] r3 = {a[0]};
            return r3;
        } else {
            int[] r4 = {a[0], b[0]};
            return r4;
        }
    }
}
