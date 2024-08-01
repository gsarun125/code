package jan.Day6;

/*
28.Reverse the given string keeping the position of special characters intact
 */

/*
Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.
*/
public class Qus28 {
    public static void main(String[] args) {
        String str = "A&x#";
        reverse(str);
    }

    private static void reverse(String input) {
        char[] str = input.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {

            //if the both is alphabet then interchange
            if (Character.isAlphabetic(str[i]) && Character.isAlphabetic(str[j])) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if (Character.isAlphabetic(str[i]) && !Character.isAlphabetic(str[j])) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(new String(str));
    }
}
