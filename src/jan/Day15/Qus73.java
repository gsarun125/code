package jan.Day15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 Sort the array elements in descending order according to their frequency of occurrence
Input : [ 2 2 3 4 5 12 2 3 3 3 12 ]
Output : 3 3 3 3 2 2 2 12 12 4 5
Explanation : 3 occurred 4 times, 2 occurred 3 times, 12 occurred 2 times, 4 occurred 1 time, 5 occurred 1 time
Input : [ 0 -1 2 1 0 ]
Output : 0 0 -1 1 2
Note : sort single occurrence elements in ascending order

 */
public class Qus73 {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5,12,2,3,3,3,12};
        findOccurred(arr);
        for (int element:arr){
            System.out.println(element+" ");
        }
    }

    private static void findOccurred(int[] arr) {
        Map<Integer,Integer> frequencyMap=new HashMap<>();

        for(int i:arr){
            frequencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                int freq1=frequencyMap.get(arr[j]);
                int freq2=frequencyMap.get(arr[j+1]);
                if((freq1<freq2)||(freq1==freq2 && arr[j]>arr[j+1])){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


    }
}
