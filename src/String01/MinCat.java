package String01;

/* Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are
   different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
   The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello" */

public class MinCat {
    public String minCat(String a, String b) {
        if (a.equals(null) || a.length() == 0 || b.equals(null) || b.length() == 0)
            return "";

        String result = "";
        int l1 = a.length();
        int l2 = b.length();
        int l = Math.min(l1, l2);
        return a.substring(l1-l) + b.substring(l2-l);
    }
}
