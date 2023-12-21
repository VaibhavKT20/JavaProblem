package JavaPrograms;

public class LargestOfArray {
    public static int LargestNumber(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        int arr[]={12,11,13,43,5,32,15,100};
        int n=arr.length;
        int result=LargestNumber(arr,n);
        System.out.println("Largest number in an array is "+result);
    }
}
