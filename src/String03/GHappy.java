package String03;

/* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false */

public class GHappy {
    public static boolean gHappy(String str) {
        if (str.equals(""))
            return true;
        if (str.length() == 1) {
            if (str.equals("g"))
                return false;
            else
                return true;
        }

        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i == 0) {
                    if (str.charAt(i + 1) != 'g')
                        flag = false;
                }
                else if (i == str.length() - 1) {
                    if (str.charAt(i - 1) != 'g')
                        flag = false;
                }
                else {
                    if (str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g')
                        flag = false;
                }

            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("g"));
    }
}
