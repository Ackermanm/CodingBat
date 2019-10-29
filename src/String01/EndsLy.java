package String01;

/* Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false */

public class EndsLy {
    public boolean endsLy(String str) {
        if (str.equals(null) || str.length() <= 1)
            return false;
        else {
            if (str.substring(str.length() - 2, str.length()).equals("ly"))
                return true;
            else
                return false;
        }
    }
}
