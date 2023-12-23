package MatrixProblem;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        int trMat[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                //Transpose
                trMat[j][i]=mat[i][j];
            }
        }
        //Printing
        System.out.println("Transpose of matrix is :");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(" "+trMat[i][j]+" " );
            }
            System.out.println();
        }
    }

}
