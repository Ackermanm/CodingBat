package Array01;

/* Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1 */

public class Start1 {
    public int start1(int[] a, int[] b) {
        int la = a.length;
        int lb = b.length;
        int counter = 0;

        if (la == 0 && lb == 0) {
            return 0;
        } else if (la == 0 && lb != 0) {
            if (b[0] == 1)
                return 1;
            else return 0;
        } else if (la != 0 && lb == 0) {
            if (a[0] == 1)
                return 1;
            else return 0;
        } else {
            int[] array = {a[0], b[0]};
            for (int i = 0; i < 2; i++) {
                if (array[i] == 1)
                    counter++;
            }
            return counter;
        }
    }
}
