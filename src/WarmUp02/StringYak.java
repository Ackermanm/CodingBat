package WarmUp02;

/* Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a"
   can be any char. The "yak" strings will not overlap.


stringYak("yakak"p) → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya" */

public class StringYak {
    public String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            }else {
                result += str.substring(i, i+1);
            }
        }
        return result;
    }
}
