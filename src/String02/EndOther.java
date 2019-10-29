package String02;

/* Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower
case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true */

public class EndOther {
    public boolean endOther(String a, String b) {
        String s, l;
        if (a.length() <= b.length()) {
            s = a;
            l = b;
        } else {
            s = b;
            l = a;
        }

        if (l.substring(l.length() - s.length()).toLowerCase().equals(s.toLowerCase()))
            return true;
        else
            return false;
    }
}
