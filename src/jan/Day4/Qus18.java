package jan.Day4;

/**
 * 18. -1 represents ocean and 1 represents land find the number of islands in the given
 * matrix.
 * Input: n*n matrix
 * 1 -1 -1 1
 * -1 1 -1 1
 * -1 -1 1 -1
 * -1 -1 -1 1
 * Output: 2 (two islands that I have
 * bold in matrix at 1, 1 and 2, 2)
 */
public class Qus18 {
    public static void main(String[] args) {
        int arr[][] = {{1, -1, -1, 1}, {-1, 1, -1, 1}, {-1, -1, 1, -1}, {-1, -1, -1, 1}};
        int column = arr[0].length;
        int row = arr.length;
       int count= findIslans(arr, column, row);
        System.out.println(count);
    }

    private static int findIslans(int[][] arr, int column, int row) {
        int count = 0;
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < column - 1; j++) {
                if (arr[i][j] == 1) {
                    if (arr[i][j - 1] == -1 && arr[i][j + 1] == -1 && arr[i - 1][j] == -1 && arr[i + 1][j] == -1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }


}
