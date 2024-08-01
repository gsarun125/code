package jan.Day13;

/**
 * 64.prime number – print n prime numbers
 */
public class Qus64 {
    public static void main(String[] args) {
        int n = 10;
        printFirstNPrimes(n);
    }

    private static void printFirstNPrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num + " ");
                count++;
            }
            num++;
        }

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
