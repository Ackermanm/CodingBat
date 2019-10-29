package WarmUp02;

/* Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello" */

import java.util.ArrayList;

public class StringBits {

    public static String stringBits(String str) {

        /* ArrayList L = new ArrayList();
        char[] array = str.toCharArray();

        for (int i = 0; i < str.length(); i += 2) {
            L.add(array[i]);
        }
        String result = String.join("", L);
        return result; */

        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i+1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }
}
