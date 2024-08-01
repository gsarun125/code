package jan.Day15;

/*
Print true if the second string is a substring of the first string, else print false.
Note: * symbol can replace any number of characters
Input: Spoon Sp*n Output: TRUE
       Zoho *o*o Output: TRUE
       Man n* Output: FALSE
       Subline line Output: TRUE
 */
public class Qus74 {
    public static void main(String[] args) {
        String first = "Zoho";
        String second = "*o*o";

        boolean result = validate(first, second);
        System.out.println(result);
    }

    private static boolean validate(String first, String second) {
        int i = 0, j = 0;

        while (i < first.length() && j < second.length()) {
            if (second.charAt(j) == '*') {
                // '*' can replace any number of characters
                j++;
                while (i < first.length() && j < second.length() && first.charAt(i) != second.charAt(j)) {
                    i++;
                }
            } else {
                // Normal character, should match exactly
                if (first.charAt(i) != second.charAt(j)) {
                    return false;
                }
                i++;
                j++;
            }
        }

        // Check if we have reached the end of both strings
        return j == second.length() && i <= first.length();
    }
}
