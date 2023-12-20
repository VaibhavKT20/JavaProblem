package JavaPrograms;

public class ThirdLargestOfArray {
    public static int ThirdLargest(int arr[],int total){
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[total-3];
    }
    public static void main(String[] args){
        int arr[]={10,21,34,21,45,32,5,6,7,8,9};
        int result=ThirdLargest(arr,arr.length);
        System.out.println("The Third largest of an array is "+result);
    }
}
