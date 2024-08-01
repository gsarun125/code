package jan.Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
61..sort the array odd numbers in ascending and even numbers in descending.
I/p 5 8 11 6 2 1 7
O/p 1 5 7 11 8 6 2

 */
public class Qus61 {
    public static void main(String[] args) {
        int[] array = {5, 8, 11, 6, 2, 1, 7};
        sortOddEvenInPlace(array);
       for (int i:array){
           System.out.print(i+" ");
       }
    }

    private static void sortOddEvenInPlace(int[] array) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();

        for(int i=0;i< array.length;i++){
            if (array[i]%2==0){
                even.add(array[i]);
            }
            else {
                odd.add(array[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        int i=0;
        for (int j:odd){
            array[i]=j;
            i++;
        }
        for (int j:even){
            array[i]=j;
            i++;
        }
    }
}
