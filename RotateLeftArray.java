package JavaPrograms;

public class RotateLeftArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=3;
        System.out.print("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<n;i++){
            int j;
            int first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.print("\nLeft Rotated array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+ arr[i]);
        }
    }
}
