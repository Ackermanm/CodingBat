package String01;

/* Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba" */

public class LastTwo {
    public String lastTwo(String str) {
        if (str.equals(null) || str.length() <= 1)
            return str;
        else
            return str.substring(0, str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
    }
}
