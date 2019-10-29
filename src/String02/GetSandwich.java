package String02;

/* A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → "" */

public class GetSandwich {
    public static String getSandwich(String str) {
        if (str.equals("") || str.length() < 10)
            return "";
        String result = "";
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                result = str.substring(i + 5);
                break;
            }
        }
        boolean flag = false;
        for (int i = result.length() - 1; i > 4; i--) {
            if (result.substring(i - 4, i + 1).equals("bread")) {
                result = result.substring(0, i - 4);
                flag = true;
                break;
            }
        }
        if (flag == false)
            result = "";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }
}
