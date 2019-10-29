package Recursion01;

/* Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0 */

public class CountHi2 {
    public static int countHi2(String str) {
        if (str.equals("") || str.length() == 1)
            return 0;
        if (str.length() >= 2 && str.substring(0, 2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        else if (str.length() >= 3 && str.substring(1, 3).equals("hi")) {
            if (str.charAt(0) != 'x')
                return 1 + countHi2(str.substring(3));
            else
                return countHi2(str.substring(3));
        }
        else
            return countHi2(str.substring(1));
    }

    public static void main(String[] args) {
        countHi2("xxxx");
    }
}
