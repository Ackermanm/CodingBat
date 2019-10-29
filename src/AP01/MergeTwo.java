package AP01;

/* Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return
a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without
duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.


mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"] */

import java.util.Arrays;

public class MergeTwo {
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int length = a.length + b.length;
        String[] sum = new String[length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for (int i = b.length - 1; i >= 0; i--) {
            sum[i + a.length] = b[i];
        }
        Arrays.sort(sum);
        result[0] = sum[0];
        int flag = 1;
        int position = 1;
        while (flag < n) {
            if (sum[position].equals(sum[position - 1]))
                position++;
            else {
                result[flag] = sum[position];
                position++;
                flag++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};
        System.out.println(mergeTwo(a, b, 3));
    }
}
