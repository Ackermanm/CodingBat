package String01;

/* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
   return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi" */

public class WithoutX2 {
    public String withoutX2(String str) {
        if (str.equals(null) || str.length() == 0) {
            return "";
        } else if (str.length() == 1) {
            if (str.equals("x"))
                return "";
            else return str;
        } else if (str.length() == 2) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
                return "";
            else if (str.charAt(0) == 'x' && str.charAt(1) != 'x')
                return str.substring(1);
            else if (str.charAt(0) != 'x' && str.charAt(1) == 'x')
                return str.substring(0, 1);
            else return str;
        } else {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
                return str.substring(2);
            else if (str.charAt(0) == 'x' && str.charAt(1) != 'x')
                return str.substring(1);
            else if (str.charAt(0) != 'x' && str.charAt(1) == 'x')
                return str.substring(0, 1) + str.substring(2);
            else return str;
        }
    }
}
