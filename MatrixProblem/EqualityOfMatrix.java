package MatrixProblem;

public class EqualityOfMatrix {
    public static void main(String[] args) {
        int mat1[][]={{19,20,21},{10,20,30},{10,10,10}};
        int mat2[][]={{19,20,21},{10,20,30},{10,10,10}};
        int row1,row2,col1,col2;
        boolean flag=true;
        row1= mat1.length;
        row2=mat2.length;
        col1=mat1[0].length;
        col2=mat2[0].length;
        if(row1!=row2||col1!=col2){
            System.out.println("Matrix is not equal...");
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Matrix is equal...");
        }
        else{
            System.out.println("Matrix is not equal...");
        }
    }
}
