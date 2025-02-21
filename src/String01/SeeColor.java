package String01;

/* Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue" */

public class SeeColor {
    public String seeColor(String str) {
        if (str.equals(null) || str.length() < 3)
            return "";
        else {
            if (str.substring(0, 3).equals("red"))
                return "red";
            else if ((str.length() >= 4 && str.substring(0, 4).equals("blue")))
                return "blue";
            else return "";
        }
    }
}
