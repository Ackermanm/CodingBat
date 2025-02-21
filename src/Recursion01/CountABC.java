package Recursion01;

/* Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2 */

public class CountABC {
    public int countAbc(String str) {
        if (str.equals("") || str.length() < 3)
            return 0;
        return str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba") ? 1 + countAbc(str.substring(1)) : countAbc(str.substring(1));
    }
}
