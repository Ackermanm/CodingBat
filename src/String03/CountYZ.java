package String03;

/* Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2 */

public class CountYZ {
    public int countYZ(String str) {
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (i == str.length() - 1 && (Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z'))
                count++;
            else if (!Character.isLetter(str.charAt(i)) && (Character.toLowerCase(str.charAt(i - 1)) == 'y' || Character.toLowerCase(str.charAt(i - 1)) == 'z'))
                count++;
        }

        return count;
    }
}
