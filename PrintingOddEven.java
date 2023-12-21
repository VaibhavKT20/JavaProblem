package JavaPrograms;

public class PrintingOddEven {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.print("Even number:");
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(" "+arr[i]);
            }
        }
        System.out.print("\nOdd number:");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
