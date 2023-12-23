package MatrixProblem;

public class FrequencyOfOddEven {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row,col,countEven=0,countOdd=0;
        row=mat.length;
        col=mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]%2==0){
                    countEven++;
                }
                else{
                    countOdd++;
                }
            }
        }
        System.out.print("Frequency of Even: "+countEven);
        System.out.print("\nFrequency of Odd: "+countOdd);
    }
}
