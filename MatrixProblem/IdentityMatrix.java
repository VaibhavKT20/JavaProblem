package MatrixProblem;

public class IdentityMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,0,0},{0,1,0},{0,0,1}};
        int row=mat.length;
        int col=mat[0].length;
        boolean flag=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j&&mat[i][j]!=1){
                    flag=false;
                    break;
                }
                if(i!=j&&mat[i][j]==1){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.print("Matrix given is Identity matrix");
        }
        else{
            System.out.print("Matrix given is Not a identity matrix");
        }
    }

}
