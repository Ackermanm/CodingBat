package String03;

/* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)


notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right" */

public class NotReplace {
    public String notReplace(String str) {
        if (str.equals("") || str.length() < 2)
            return str;
        if (str.length() == 2) {
            if (str.equals("is"))
                return "is not";
            else
                return str;
        }

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                if (i == 0) {
                    if (!Character.isLetter(str.charAt(i + 2)))
                        result += "is not";
                    else
                        result += "is";
                } else if (i == str.length() - 2) {
                    if (!Character.isLetter(str.charAt(i - 1)))
                        result += "is not";
                    else
                        result += "is";
                } else {
                    if (!Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1)))
                        result += "is not";
                    else
                        result += "is";
                }
                i++;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        return result;
    }
}
