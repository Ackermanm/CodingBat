package String03;

/* Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a
series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18 */

public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String num = "";
            if (Character.isDigit(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    if (j == str.length() - 1)
                        i = j;
                    if (!Character.isDigit(str.charAt(j))) {
                        i = j;
                        break;
                    }
                    num += str.substring(j, j + 1);
                }
                sum += Integer.parseInt(num);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }
}
