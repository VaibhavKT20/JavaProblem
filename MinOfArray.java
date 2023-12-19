package JavaPrograms;

public class MinOfArray {
    public static void main(String[] args) {
        int arr[]={34,2,34,6,54,67,0,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum of an array is "+min);
    }
}
