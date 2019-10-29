package String02;

/* Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char
of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre" */

public class MixString {
    public String mixString(String a, String b) {
        String result = "";
        String s, l;
        if (a.length() <= b.length()) {
            s = a;
            l = b;
        } else {
            s = b;
            l = a;
        }

        for (int i = 0; i < s.length(); i++) {
            result = result + a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        result += l.substring(s.length());

        return result;
    }
}
