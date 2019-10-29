package String01;

/* Given two strings, append them together (known as "concatenation") and return the result. However,
   if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc" */

public class ConCat {
    public String conCat(String a, String b) {
        String result = a + b;

        if (!(a.equals(null) || a.length() <= 0) && !(b.equals(null) || b.length() <= 0) && a.charAt(a.length()-1) == b.charAt(0))
            result = a + b.substring(1, b.length());

        return result;
    }
}
