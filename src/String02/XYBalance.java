package String02;

/* We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later
in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false */

public class XYBalance {
    public boolean xyBalance(String str) {
        boolean flag = false;
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x')
                c++;
        }
        if (str.equals(null) || c == 0)
            return true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        int count = 0;
                        for (int k = j; k < str.length(); k++) {
                            if (str.charAt(k) == 'x')
                                count++;
                        }
                        if (count == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag)
                        break;
                }
            }
            if (flag)
                break;
        }

        return flag;
    }
}
