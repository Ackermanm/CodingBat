package Recursion01;

/* Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx" */

public class EndX {
    public String endX(String str) {
        if (str.equals(""))
            return "";
        return str.charAt(0) == 'x' ? endX(str.substring(1)) + "x" : str.substring(0, 1) + endX(str.substring(1));
    }
}
