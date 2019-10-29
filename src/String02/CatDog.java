package String02;

/* Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true */

public class CatDog {
    public boolean catDog(String str) {
        int cCount = 0;
        int dCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't')
                cCount++;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g')
                dCount++;
        }

        if (cCount == dCount)
            return true;
        else
            return false;
    }
}
