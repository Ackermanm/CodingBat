package String02;

/* Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars
to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.


xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false */

public class XYZMiddle {
    public boolean xyzMiddle(String str) {
        if (str.equals("") || str.length() < 3)
            return false;

        boolean flag = false;
        int a = str.length() / 2;
        if (str.length() % 2 == 1) {
            String m = str.substring(a - 1, a + 2);
            if (m.equals("xyz"))
                flag = true;
        } else {
            String l = str.substring(a - 2, a + 1);
            String r = str.substring(a - 1, a + 2);
            if (l.equals("xyz") || r.equals("xyz"))
                flag = true;
        }

        return flag;
    }
}
