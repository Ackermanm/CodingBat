package Recursion01;

/* Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b" */

public class AllStar {
    public String allStar(String str) {
        if (str.equals("") || str.length() == 1)
            return str;
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}
