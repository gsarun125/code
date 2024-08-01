package jan.Day6;

/*
27.Find whether the given number is palindrome or not. Don’t use arrays or strings
 */
public class Qus27 {
    public static void main(String[] args) {
        int number = 121;
        if (checkPalindrome(number)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

    private static boolean checkPalindrome(int number) {

        int temp = number;
        int reversenumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversenumber = (reversenumber * 10) + remainder;
            number = number / 10;
        }
        if (temp == reversenumber) {
            return true;
        } else {
            return false;
        }
    }


}
