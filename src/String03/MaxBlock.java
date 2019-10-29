package String03;

/* Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0 */

public class MaxBlock {
    public static int maxBlock(String str) {
        int origin = 0;
        int flag = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                flag = 0;
            }
            flag++;
            if (origin < flag)
                origin = flag;
        }
        return origin;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("xyzz"));
    }
}
