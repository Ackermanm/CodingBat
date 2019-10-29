package Recursion01;

/* Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → "" */

public class NoX {
    public String noX(String str) {
        if (str.equals(""))
            return "";

        return str.charAt(0) == 'x' ? noX(str.substring(1)) : str.substring(0, 1) + noX(str.substring(1));
    }
}
