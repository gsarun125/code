package jan.Day9;

/*
42. Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}
//{4,0,0,4,0,8}
Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0

 */
public class Qus42 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 0, 4, 0, 8};
        int j = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * arr[i + 1];
                arr[i + 1] = 0;
            }
        }

        //moving zero
        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }
        display(arr);

    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "");
        }
        System.out.println();
    }
}
