package MatrixProblem;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int mat1[][]={{19,20,21},{10,20,30},{10,10,10}};
        int mat2[][]={{19,20,21},{10,20,30},{10,10,10}};
        int row=mat1.length;
        int col=mat1[0].length;
        int diff[][]=new int[row][col];
        System.out.println("Difference is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                diff[i][j]=mat1[i][j]-mat2[i][j];
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }

    }
}
