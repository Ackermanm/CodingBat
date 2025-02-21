package String01;

/* Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of
   the string, except its first char does not need to match exactly. On a match, return the front of the string, or
   otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
   The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h" */

public class StartWord {
    public String startWord(String str, String word) {
        int l1 = str.length();
        int l2 = word.length();

        if (l1 < l2)
            return "";

        if (l2 == 1)
            return str.substring(0, 1);

        if (str.substring(1, l2).equals(word.substring(1)))
            return str.substring(0, l2);
        else return "";
    }
}
