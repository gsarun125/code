package Youtube;

public class Push0sToEnd {
    public static void main(String[] args) {
        int arr[]={1,2,0,0,4,0,9,1,0};
        int i=0;
        int j= arr.length-1;
        while (i<j){
            while (i < j && arr[i] != 0) {
                i++;
            }
            while (i < j && arr[j] == 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move i and j to the next positions
                i++;
                j--;
            }
        }
        for (int a:arr){
            System.out.print(a+ " ");
        }

    }

}
