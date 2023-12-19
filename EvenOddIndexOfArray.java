package JavaPrograms;

public class EvenOddIndexOfArray {
    public static void main(String[] args) {
        int arrEven[]={1,2,3,4,5,6};
        System.out.print("even index of array: ");
        for(int i=1;i<arrEven.length;i=i+2){
            System.out.print(arrEven[i]+" ");
        }
        int arrOdd[]={1,2,3,4,5,6};
        System.out.print("\n"+"odd index of array: ");
        for(int i=0;i<arrOdd.length;i=i+2){
            System.out.print(arrOdd[i]+" ");
        }
    }
}
