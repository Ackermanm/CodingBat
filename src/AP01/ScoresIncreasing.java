package AP01;

/* Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true */

public class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        boolean flag = true;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
