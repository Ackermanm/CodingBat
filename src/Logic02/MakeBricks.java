package Logic02;

/* We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks
(5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder
than it looks and can be done without any loops. See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true */

public class MakeBricks {
    public static boolean makeBricks(int small, int big, int goal) {
        boolean flag = false;

        for (int j = 0; j <= big; j++) {
            for (int i = 0; i <= small; i++) {
                if ((i + j * 5) == goal) {
                    flag = true;
                }
            }
            if (flag) break;
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
    }
}
