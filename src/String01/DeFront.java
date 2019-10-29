package String01;

/* Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second
   char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay" */

public class DeFront {
    public String deFront(String str) {
        if (str.equals(null) || str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            if (str.equals("a"))
                return "a";
            else return "";
        } else if (str.length() == 2) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
                return "ab";
            else if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
                return "a";
            else if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
                return "b";
            else
                return "";
        } else {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
                return str;
            else if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
                return "a" + str.substring(2);
            else if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
                return "b" + str.substring(2);
            else
                return str.substring(2);
        }
    }
}
