package Logic02;

/* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19 */

public class BlackJack {
    public int blackjack(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (min > 21)
            return 0;
        else if (min <= 21 && max > 21)
            return min;
        else
            return max;
    }
}
