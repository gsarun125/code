package jan.Day11;

/*
54.Given two dimensional matrix of integer and print the rectangle can be formed using given indices and also find the sum of the elements in the rectangle
Input: mat[M][N] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
index = (2, 0) and (3, 4)
Output:
Rectangle
4 6 7 5 5
2 4 8 9 4
sum 54
 */
public class Qus54 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4}};
        int rowStart = 2;
        int colStart = 0;
        int rowEnd = 3;
        int colEnd = 4;
        printSubmatrixAndSum(mat, rowStart, colStart, rowEnd, colEnd);
    }

    private static void printSubmatrixAndSum(int[][] mat, int rowStart, int colStart, int rowEnd, int colEnd) {
        System.out.println("Rectangle:");
        int sum = 0;
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(mat[i][j] + " ");
                sum += mat[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }

}
