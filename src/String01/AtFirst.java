package String01;

/* Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@" */

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AtFirst {
    public String atFirst(String str) {
        if (str.equals(null) || str.length() == 0)
            return "@@";
        else if (str.length() == 1)
            return str + "@";
        else return str.substring(0, 2);
    }

    @Test
    public void testAtFirst() {
        assertTrue(atFirst("hello").equals("he"));
    }
}
