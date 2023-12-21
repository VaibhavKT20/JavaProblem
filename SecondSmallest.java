package JavaPrograms;

public class SecondSmallest {
    public static int SecondSmallNum(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[1];
//        return arr[0]; //Smallest element in an array;
    }
    public static void main(String[] args) {
        int arr[]={12,3,14,5,1,53,24,2};
        int n=arr.length;
        int result=SecondSmallNum(arr,n);
        System.out.println("Second smallest nuber is "+result);
    }
}
