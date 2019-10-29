package Recursion01;

/* Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p" */

public class ChangePi {
    public static String changePi(String str) {
        if (str.equals("") || str.length() < 2)
            return str;

        return str.substring(0, 2).equals("pi") ? "3.14" + changePi(str.substring(2)) : str.substring(0, 1) + changePi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changePi("pipi"));
    }
}
