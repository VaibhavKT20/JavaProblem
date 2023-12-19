package JavaPrograms;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print(" Original Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n Reversed Array is :");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
