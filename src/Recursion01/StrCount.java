package Recursion01;

/* Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.


strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0 */

public class StrCount {
    public int strCount(String str, String sub) {
        int l = sub.length();
        if (str.equals("") || str.length() < sub.length())
            return 0;
        return str.substring(0, l).equals(sub) ? 1 + strCount(str.substring(l), sub) : strCount(str.substring(1), sub);
    }
}
