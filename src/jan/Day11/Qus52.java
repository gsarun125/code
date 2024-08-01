package jan.Day11;


/*
52.Given a number, find the next smallest palindrome.
 */
public class Qus52 {
    public static void main(String[] args) {
        int orginalNumber = 123;
        int nextpalindrome = getNextSmallPalindrome(orginalNumber);
        System.out.println(nextpalindrome);
    }

    private static int getNextSmallPalindrome(int orginalNumber) {
        while (true) {
            orginalNumber++;
            if (isPalindrome(orginalNumber)) {
                return orginalNumber;
            }
        }
    }

    private static boolean isPalindrome(int orginalNumber) {
        int temp = orginalNumber;
        int reverseNum = 0;

        while (orginalNumber > 0) {
            int digit = orginalNumber % 10;
            reverseNum = reverseNum * 10 + digit;
            orginalNumber = orginalNumber / 10;
        }
        return temp == reverseNum;
    }
}
