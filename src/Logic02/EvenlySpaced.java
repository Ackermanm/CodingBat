package Logic02;

/* Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false*/

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int min  = Math.min(a, b);
        int max = Math.max(a, b);
        int middle;

        if (c <= min) {
            middle = min;
            min = c;
        } else if (c >= max) {
            middle = max;
            max = c;
        } else {
            middle = c;
        }

        if (middle - min == max - middle)
            return true;
        else
            return false;
    }
}
