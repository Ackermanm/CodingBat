package WarmUp02;

/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/

public class AltPairs {
    public String altPairs(String str) {
        String result = "";
        int len = str.length();

        if (len % 4 == 1) {
            for (int i = 0; i < str.length()-1; i += 4) {
                result += str.substring(i, i+2);
            }
            result += str.substring(len-1, len);
        }else {
            for (int i = 0; i < str.length(); i += 4) {
                result += str.substring(i, i+2);
            }
        }
        return result;
    }
}
