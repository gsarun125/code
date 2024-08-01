package jan.Day3;

/**
 * 13.Print the word with odd letters – PROGRAM
 * Sample Output-
 * P      P
 * R    R
 * O O
 * G
 * R  R
 * A     A
 * M       M
 * <p>
 * <p>
 * P         M
 * R      A
 * O  R
 * G
 * O    R
 * R       A
 * P          M
 */
public class Qus13 {
    public static void main(String[] args) {
        String str = "PROGRAM";
        char[] chars = str.toCharArray();
        partern1(chars);
        partern2(chars);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    System.out.print(str.charAt(i));
                } else if (i + j == chars.length - 1) {
                    System.out.print(chars[i]);
                }

                if (j == chars.length - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    private static void partern2(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == j) {
                    System.out.print(chars[i]);
                } else if (i + j == chars.length - 1) {
                    System.out.print(chars[j]);
                }

                if (j == chars.length - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    private static void partern1(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                //i and j equal the print else if i+j=length-1 the print
                if (i == j) {
                    System.out.print(chars[i]);
                } else if (i + j == chars.length - 1) {
                    System.out.print(chars[i]);
                }
// if j if at the end then move next line and else add space
                if (j == chars.length - 1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
