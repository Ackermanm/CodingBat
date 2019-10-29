package AP01;

/* Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of
the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking
advantage of the fact that they are in alphabetical order.


commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3 */

import java.util.ArrayList;

public class CommonTwo {
    public static int commonTwo(String[] a, String[] b) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : a) {
            if (!list1.contains(s))
                list1.add(s);
        }
        String[] c = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            c[i] = list1.get(i);
        }
        for (String s : b) {
            if (!list2.contains(s))
                list2.add(s);
        }
        String[] d = new String[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            d[i] = list2.get(i);
        }
        String[] min;
        String[] max;
        if (c.length <= d.length) {
            min = c;
            max = d;
        } else {
            min = d;
            max = c;
        }
        int count = 0;
        for (int i = 0; i < min.length; i++) {
            if (isAppear(min[i], max))
                count++;
        }
        return count;
    }

    static boolean isAppear(String s, String[] sa) {
        boolean flag = false;
        for (String x : sa) {
            if (x.equals(s)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String[] a = {"a", "c", "x"};
        String[] b = {"b", "c", "d", "x"};
        System.out.println(commonTwo(a, b));
    }
}
