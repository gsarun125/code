package jan.Day10;

/*
49. Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece

 */
public class Qus49b {
    public static void main(String[] args) {
        String string = "expErIence";
        String s2 = "En";
        String result = removeCharacter(string, s2);

        System.out.println(result);
    }

    private static String removeCharacter(String string, String s2) {
        StringBuilder result = new StringBuilder();
        for (char ch : string.toCharArray()) {

            System.out.println(s2.indexOf(ch));
            if (s2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
