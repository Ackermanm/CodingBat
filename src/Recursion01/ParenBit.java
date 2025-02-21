package Recursion01;

/* Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis
and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)" */

public class ParenBit {
    public static String parenBit(String str) {
        if (str.equals("") || str.length() == 1)
            return "";
        if (str.charAt(0) == '(') {
            if (str.charAt(str.length() - 1) == ')') {
                return str;
            } else {
                return parenBit(str.substring(0, str.length() - 1));
            }
        } else {
            return parenBit(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
    }
}
