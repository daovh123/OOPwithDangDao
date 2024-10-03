import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * Aa run is a series of adajcent chars that are the same.
     * @param str la sau can kiem tra.
     * @return max run length
     */
    public static int maxRun(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     *
     * @param str la xau ktra
     * @return blown up string
     */
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                int count = Character.getNumericValue(currentChar);
                if (i + 1 < str.length()) {
                    char nextChar = str.charAt(i + 1);
                    for (int j = 0; j < count; j++) {
                        result.append(nextChar);
                    }
                }
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
    public static boolean stringIntersect(String a, String b, int len) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            substrings.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            String substringB = b.substring(i, i + len);
            if (substrings.contains(substringB)) {
                return true;
            }
        }
        return false;
    }
}
