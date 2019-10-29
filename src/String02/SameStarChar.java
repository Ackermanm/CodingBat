package String02;

/* Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true */

public class SameStarChar {
    public static boolean sameStarChar(String str) {
        boolean flag = true;
        if (str.equals("") || str.length() == 1)
            flag = true;
        if (str.length() == 2 && (!str.substring(0, 1).equals("*") && !str.substring(1, 2).equals("*")) || str.equals("**"))
            flag = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("*xa*a*b"));
    }
}
