package jan.Day14;

/*
66.adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119
 */
public class Qus66 {
    public static void main(String[] args) {
        int digit = 4;
        int number = 2875;

        int resultNumber = 0;
        int multiplier = 1;
        while (number > 0) {
            int rem = number % 10;
            System.out.println(rem);
            int l=Integer.toString(rem).length();
            int pow= (int) Math.pow(10,l);
            resultNumber = (resultNumber * pow) +rem+4;
            System.out.println(resultNumber+"jhsjkhj");
            number /= 10;
        }
        System.out.println(resultNumber);
    }
}
