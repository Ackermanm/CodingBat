package AP01;

/* Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ
from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.


scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true */

public class ScoresClump {
    public boolean scoresClump(int[] scores) {
        boolean flag = false;
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 1]) <= 2 && Math.abs(scores[i] - scores[i + 2]) <= 2 && Math.abs(scores[i + 2] - scores[i + 1]) <= 2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
