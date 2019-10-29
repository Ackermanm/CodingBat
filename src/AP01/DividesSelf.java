package AP01;

/* We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example
128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly,
so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false */

public class DividesSelf {
    public boolean dividesSelf(int n) {
        String s = String.valueOf(n);
        boolean hasZero = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }
        if (hasZero)
            return false;
        else {
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                if (n % Integer.parseInt(s.substring(i, i + 1)) != 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }
}
