package MatrixProblem;

public class SparseMatrix {
    public static void main(String[] args) {
        int mat[][]={{5,0,0},{0,6,0},{0,0,9}};
        int row=mat.length;
        int col=mat[0].length;
        int count=0;
        int size=row*col;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    count++;
                }
            }
        }
        if(count>(size/2)){
            System.out.println("Sparse Matrix");
        }
        else{
            System.out.println("Not a Sparse Matrix");
        }
    }
}
