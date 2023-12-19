package JavaPrograms;

public class MaxOfArray {
    public static void main(String[] args) {
        int arr[]={25,6,7,34,76,89,2};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max value of given array is "+max);
    }
}
