package String02;

/* Given a string and a non-empty word string, return a string made of each char just before and just after every
appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be
included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"*/

public class WordEnds {
    public String wordEnds(String str, String word) {
        if (str.equals("") || str.length() <= word.length())
            return "";

        String result = "";
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i == 0)
                    result += str.substring(i + word.length(), i + word.length() + 1);
                else if (i + word.length() == str.length())
                    result += str.substring(i - 1, i);
                else
                    result = result + str.substring(i - 1, i) + str.substring(i + word.length(), i + word.length() + 1);
                i += word.length() - 1;
            }
        }
        return result;
    }
}
