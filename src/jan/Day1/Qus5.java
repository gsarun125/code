package jan.Day1;
/*
Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG
fashion as shown in figure.
Example:
Input:
1 2 3
4 5 6
7 8 9
Output:
123654789
 */
public class Qus5 {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
