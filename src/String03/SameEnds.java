package String03;

/* Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x" */

public class SameEnds {
    public static String sameEnds(String string) {
        String result = "";
        String head = string.substring(0, string.length() / 2);
        String tail = string.substring(string.length() - string.length() / 2);
        for (int i = 0; i < string.length() / 2; i++) {
            if (head.equals(tail)) {
                result = head;
                break;
            }
            head = head.substring(0, head.length() - 1);
            tail = tail.substring(1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }
}
