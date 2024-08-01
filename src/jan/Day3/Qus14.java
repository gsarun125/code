package jan.Day3;

/*
Given an array of integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.
Sample Input – Alternate Sorting
Input: {1, 2, 3, 4, 5, 6, 7}
output: {7, 1, 6, 2, 5, 3, 4}
 */
public class Qus14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            //if i is even then find the maximum value
            if (i % 2 == 0) {
                int max = arr[i];
                int maxindex = i;
                //find the max value
                for (int j = i + 1; j < arr.length; j++) {
                    if (max < arr[j]) {
                        maxindex = j;
                    }
                }
                //if any max value then swap
                if (i != maxindex) {
                    int temp = arr[i];
                    arr[i] = arr[maxindex];
                    arr[maxindex] = temp;
                }
            }
            //if i is odd then find the min value
            else {
                int min = arr[i];
                int minindex = i;
                //find the min value
                for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[j]) {
                        minindex = j;
                    }
                }
                //if any min value then swap
                if (i != minindex) {
                    int temp = arr[i];
                    arr[i] = arr[minindex];
                    arr[minindex] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
