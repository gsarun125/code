package jan.Day5;

/**
 25. Given an array of integers, write a program to re-arrange the array in the given
 form.
 1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. etc
 */
public class Qus25 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int l=arr.length;
        reArrange(arr,l);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    private static void reArrange(int[] arr, int l) {
        for (int i=0;i<l;i++){
            if (i%2==0){
                int max_index=i;
                int maxvalue=arr[i];
                for (int j=i+1;j<l;j++){
                    if (maxvalue<arr[j]){
                        max_index=j;
                    }
                }
                swap(arr,max_index,i);
            }
            else {
                int min_index=i;
                int minvalue=arr[i];
                for (int j=i+1;j<l;j++){
                    if (minvalue>arr[j]){
                        min_index=j;
                    }
                }
                swap(arr,min_index,i);
            }
        }
    }

    private static void swap(int[] arr, int maxIndex, int i) {
        int temp=arr[i];
        arr[i]=arr[maxIndex];
        arr[maxIndex]=temp;
    }
}
