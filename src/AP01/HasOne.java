package AP01;

/* Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


hasOne(10) → true
hasOne(22) → false
hasOne(220) → false */

public class HasOne {
    public boolean hasOne(int n) {
        String s = String.valueOf(n);
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
