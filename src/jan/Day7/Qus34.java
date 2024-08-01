package jan.Day7;
/*34. Matrix Diagonal sum
Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
I/P:
3 3
1 2 3
4 5 6
7 8 9
O/P: 38
*/
public class Qus34 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        matrixDiagonal(arr);
    }

    private static void matrixDiagonal(int[][] arr) {
        int leftTop=0;
        int rightBottom=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (i+j<=2){
                    leftTop+=arr[i][j];
                }
                if(i+j>=2){
                    rightBottom+=arr[i][j];
                }
            }
        }
        int ansMax=Math.max(leftTop,rightBottom);
        System.out.println(ansMax);
    }
}
