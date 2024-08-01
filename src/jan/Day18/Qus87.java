package jan.Day18;

/*
. Given an array of numbers. Print the numbers without duplication.




  INPUT  :

  Enter the array size  :  4
  Enter the elements  :  1 1 2 4

  OUTPUT  :

  1 2 4
 */
public class Qus87 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 4};
        int l = arr.length;
        printUniqueNumber(arr, l);
    }

    private static void printUniqueNumber(int[] arr, int l) {
        for (int i = 0; i < l; i++) {
            boolean isDuplicated = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicated = true;
                    break;
                }
            }
            if (!isDuplicated) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
