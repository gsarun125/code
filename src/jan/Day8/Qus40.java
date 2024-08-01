package jan.Day8;

import java.util.ArrayList;
import java.util.List;

/*
Problem 40:
Given a number, print all the code that can be formed with z={a=1, .., z=26}.

    input :1123
The given string can be splitted as:
1) “1123” = “1” + “1” + “2” + “3” = aabc
2) “1123” = “11” + “2” + “3” = kbc
3) “1123” = “1” + “12” + “3” = alc
4) “1123” = “1” + “1” + “23” = aaw
5) “1123” = “11” + “23” = kw

 */
public class Qus40 {
    public static void main(String[] args) {
        String input = "1123";
        List<String> result = new ArrayList<>();
        decodeNumberString(input, 0, "", result);
        System.out.println(result);
    }

    private static void decodeNumberString(String input, int index, String current, List<String> result) {
        if (index == input.length()) {
            result.add(current);
            return;
        }

        int digit = Character.getNumericValue(input.charAt(index));
        if (digit > 0) {
            char decodedChar = (char) ('a' + digit - 1);
            decodeNumberString(input, index + 1, current + decodedChar, result);
        }

        if (index + 1 < input.length()) {

            int twoDigit = Integer.parseInt(input.substring(index, index + 2));
            if (twoDigit >= 10 && twoDigit < 26) {
                char decodedChar = (char) ('a' + twoDigit - 1);
                decodeNumberString(input, index + 2, current + decodedChar, result);
            }
        }
    }
}
