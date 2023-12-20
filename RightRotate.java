package JavaPrograms;

public class RightRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=3;
        System.out.print("Original Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<n;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }


        System.out.print("\nRight Rotated array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
