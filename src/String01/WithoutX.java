package String01;

/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi" */

public class WithoutX {
    public String withoutX(String str) {
        if (str.equals(null) || str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            if (str.equals("x"))
                return "";
            else return str;
        } else {
            String result = str;

            if (result.charAt(0) == 'x') {
                result = result.substring(1);
                if (result.charAt(result.length()-1) == 'x')
                    result = result.substring(0, result.length()-1);
            } else {
                if (result.charAt(result.length()-1) == 'x')
                    result = result.substring(0, result.length()-1);
            }

            return result;
        }
    }
}
