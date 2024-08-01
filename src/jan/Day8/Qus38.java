package jan.Day8;

import java.util.Arrays;


/*
Problem 38:
Given a 6 blocks, of different height h1, …, h6 . Make 2 towers using 3 Blocks for each tower in desired height h1, h2. Print the blocks to be used in ascending order
Input:
1 2 5 4 3  6
height of tower: 6 15
Output :
1 2 3 & 4 5 6

 */
public class Qus38 {
    public static void main(String[] args) {
        int[] elements = {1, 2, 5, 4, 3, 6};
        int h1 = 6;
        int h2 = 15;
        int[] list = findElements(elements, h1);
        int[] list1=findElements(elements,h2);
        Arrays.sort(list1);
        System.out.println(list);
        System.out.println(list1);
    }

    private static int[] findElements(int[] elements, int h1) {
        int[] ans = new int[3];
        for (int i = 0; i < elements.length - 2; i++) {
            for (int j = i + 1; j < elements.length - 1; j++) {
                for (int k = j + 1; k < elements.length; k++) {
                    int temp = elements[i] + elements[j] + elements[k];
                    if (temp == h1) {
                        ans[0]=elements[i];
                        ans[1]=(elements[j]);
                        ans[2]=(elements[k]);
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
