package Recursion01;

/* Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere,
possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true */

public class StrCopies {  // complete with others hints
    public static boolean strCopies(String str, String sub, int n) {
        if (n == 0)
            return true;
        if (str.length() < sub.length())
            return false;
        return str.substring(0, sub.length()).equals(sub) ? strCopies(str.substring(1), sub, n - 1) : strCopies(str.substring(1), sub, n);
        // the recursion change of n is the hint
    }

    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }
}
