package String02;

/* Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false */

public class BobThere {
    public boolean bobThere(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                count++;
        }

        if (count > 0)
            return true;
        else
            return false;
    }
}
