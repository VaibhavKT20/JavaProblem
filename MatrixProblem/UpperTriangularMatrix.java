package MatrixProblem;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        if(row!=col){
            System.out.println("Matrix should be square matrix");
        }
        System.out.println("Upper triangular matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(i>j){
                   System.out.print("0 ");
               }else {
                   System.out.print(mat[i][j] + " ");
               }
            }
            System.out.println();
        }
    }
}
