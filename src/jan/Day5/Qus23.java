package jan.Day5;

/**
 * 23. Given a number N. find the minimum count of numbers in which N can be
 * represented as a sum of numbers x1, x2, … xn. where xi is number whose digits are 0s
 * and 1s.
 * example 1) i/p : N = 33
 * o/p : count = 3.
 * 33( 11 + 11 + 11 )
 * some other possibilities of 33 is (11 + 11 + 10 + 1), (11 + 10 + 10 + 1 + 1 ), (10 + 10 +
 * 10 + 1 + 1 + 1)
 */
public class Qus23 {
    public static void main(String[] args) {
        int n = 19;
        pseudoBinary(n);
    }

    private static void pseudoBinary(int n) {
        while (n != 0) {
            int temp = n, m = 0, p = 1;
            while (temp != 0) {
                int rem = temp % 10;
                temp = temp / 10;
                if (rem != 0)
                    m += p;
                p *= 10;
            }
            System.out.print(m + " ");
            n = n - m;
        }
        System.out.println(" ");
    }
}
