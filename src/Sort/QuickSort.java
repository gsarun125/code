package Sort;

public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {5, 6, 2, 3, 1, 8, 4};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int positon =position(arr,low,high);
            quickSort(arr,low,positon-1);
            quickSort(arr,positon+1,high);
        }

    }

    private static int position(int[] arr, int low, int high) {
        int pivot=arr[low];
        int  i=low;
        int j= high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }

            if (i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[low];
        arr[low]= arr[j];
        arr[j] =temp;
        return j;
    }
}
