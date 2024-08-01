package jan.Day9;

/*
43 . TWISTED PRIME NUMBER
A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number.
Input : 97
Output : Twisted Prime Number
Explanation: 97 is a prime number
and its reverse 79 is also a prime
number.

 */
public class Qus43 {
    public static void main(String[] args) {
        int input = 97;

        if (isTwistedPrime(input)) {
            System.out.println("is a Twisted Prime Number");
        } else {
            System.out.println("not Twisted Prime");
        }
    }

    private static boolean isTwistedPrime(int input) {
        //check the input is prime or not
        if (!isPrime(input)) {
            return false;
        }

        //if the input is prime then find the reverce and check it is prime or not
        int reverse = reverseNumber(input);
        return isPrime(reverse);
    }

    //reverse calculation
    private static int reverseNumber(int input) {

        int revered = 0;
        while (input > 0) {
            int digit = input % 10;
            revered = revered * 10 + digit;
            input /= 10;
        }
        return revered;
    }

    //check prime
    private static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
