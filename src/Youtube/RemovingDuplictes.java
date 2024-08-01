package Youtube;

public class RemovingDuplictes {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5};

        int j=0;

        for (int i=1;i< arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];

            }
        }
        for (int a :arr){
            System.out.println(a);
        }
    }
}
