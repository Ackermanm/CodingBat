package WarmUp02;

/*Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"*/

public class StringX {
    public String stringX(String str) {
        if (str.length() > 1) {
            String mResult = "";
            for (int i = 1; i < str.length()-1; i++) {
                String s = str.substring(i, i+1);
                if (!s.equals("x"))
                    mResult = mResult + s;
            }
            return str.substring(0, 1) + mResult + str.substring(str.length()-1, str.length());
        } else {
            return str;
        }
    }
}
