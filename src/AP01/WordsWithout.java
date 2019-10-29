package AP01;

/* Given an array of strings, return a new array without the strings that are equal to the target string. One approach is
to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.


wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"] */

import java.util.ArrayList;

public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {
            if (!s.equals(target))
                list.add(s);
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
