package jan.Day17;

/*
82. Find the second maximum among the given numbers.
  Ex.  INPUT  :

    Size of Array    :  8
    Enter the elements  :  2 5 1 6 2 6 7 10

    OUTPUT  :

    7

  Ex.  INPUT  :

    Size of Array    :  4
    Enter the elements  :  4 1 2 2

    OUTPUT  :

    2

  Ex.  INPUT  :

    Size of Array    :  1
    Enter the elements  :  1

    OUTPUT  :

    No second maximum

 */
public class Qus82 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 2, 6, 7, 10};
        int secodeMax = findSecondMaximum(arr);
        if (secodeMax != Integer.MIN_VALUE) {
            System.out.println(secodeMax);
        } else {
            System.out.println("no max");
        }

    }

    private static int findSecondMaximum(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

}
