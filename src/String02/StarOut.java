package String02;

/* Return a version of the given string, where for every star (*) in the string the star and the chars immediately to
its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".


starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly" */

public class StarOut {
    public String starOut(String str) {
        if (str.equals("") || str.equals("*"))
            return "";
        if (str.length() == 1 && !str.equals("*"))
            return str;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (str.charAt(i) != '*' && str.charAt(i + 1) != '*')
                    result += str.substring(i, i + 1);
            } else if (i == str.length() - 1) {
                if (str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                    result += str.substring(i, i + 1);
            } else {
                if (str.charAt(i) != '*' && str.charAt(i + 1) != '*' && str.charAt(i - 1) != '*')
                    result += str.substring(i, i + 1);
            }
        }
        return result;
    }
}
