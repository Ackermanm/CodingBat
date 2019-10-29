package String02;

/* Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp" */

public class ZipZap {
    public static String zipZap(String str) {
        if (str.equals("") || str.length() < 3)
            return str;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }
}
