package AP01;

/* Given an array of strings, return the count of the number of strings with the given length.


wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0 */

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String s : words) {
            if (s.length() == len)
                count++;
        }
        return count;
    }
}
