package jan.Day15;

/*
 Find the extra element and its index
Input : [ 10, 20, 30, 12, 5 ]
    [ 10, 5, 30, 20 ]
Output : 12 is the extra element in array 1 at index 4

Input : [ -1, 0, 3, 2 ]
    [ 3, 4, 0, -1, 2 ]
Output : 4 is the extra element in array 3 at index 5

 */
public class Qus71 {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 12, 5};
        int arr2[] = {10, 5, 30, 20};
        findExtraElement(arr1, arr2);
    }

    private static void findExtraElement(int[] arr1, int[] arr2) {
        int sumArr1 = calculateSum(arr1);
        int sumArr2= calculateSum(arr2);

        int extraElement=Math.abs(sumArr1-sumArr2);
        int extraIndex=findIndex(arr1,extraElement);
        System.out.println(extraElement);
        System.out.println(extraIndex);
    }
    private static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    private static int calculateSum(int[] arr1) {
        int sum=0;
        for(int value:arr1){
            sum+=value;
        }
        return sum;
    }
}
