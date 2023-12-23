package MatrixProblem;

public class sumOfRowAndColumn {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row,col,rowSum,colSum;
        row=mat.length;
        col=mat[0].length;

        for(int i=0;i<row;i++){
            rowSum=0;
            for(int j=0;j<col;j++){
                rowSum+=mat[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is "+rowSum);
        }

        for(int i=0;i<col;i++){
            colSum=0;
            for(int j=0;j<row;j++){
                colSum+=mat[i][j];
            }
            System.out.println("Sum of "+(i+1)+" column is "+colSum);
        }

    }

}
