package Youtube;

public class BooleanMatrix {
    public static void main(String[] args) {
        int R=2,C=2;
        int matrix[][]={{1,0},{0,0}};
        int rows[]=new int[R];
        int col[]=new int[C];
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                if(matrix[i][j]==1){
                rows[i]=1;
                col[j]=1;
                }
            }
        }

        for(int i=0;i<R;i++){
            if(rows[i]==1){
                for (int j=0;j<C;j++){
                   matrix[i][j]=1;
                }
            }
        }

        for(int j=0;j<C;j++){
            if(col[j]==1){
                for (int i=0;i<R;i++){
                    matrix[i][j]=1;
                }
            }
        }
        System.out.println();
    }

}
