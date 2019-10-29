package WarmUp02;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx"));
    }

    public static boolean doubleX(String str) {
        /*boolean checker = false;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'x' && i != array.length - 1) {
                if (array[i + 1] == 'x') {
                    checker = true;
                    break;
                }else {
                    break;
                }
            }
        }
        return checker;*/  // my answer //

        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");  // better answer //
    }
}
