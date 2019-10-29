package String02;

/* Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog" */

public class OneTwo {
    public String oneTwo(String str) {
        if (str.equals("") || str.length() < 3)
            return "";
        String result = "";
        for (int i = 0; i < str.length() / 3; i++) {
            result = result + str.substring(i * 3 + 1, i * 3 + 3) + str.substring(i * 3, i * 3 + 1);
        }
        //result += str.substring(str.length() - str.length() % 3);

        return result;
    }
}
