package Recursion01;

/* Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a" */

public class PairStar {
    public String pairStar(String str) {
        if (str.equals("") || str.length() == 1)
            return str;
        return str.charAt(0) == str.charAt(1) ? str.substring(0, 1) + "*" + pairStar(str.substring(1)): str.substring(0, 1) + pairStar(str.substring(1));
    }
}
