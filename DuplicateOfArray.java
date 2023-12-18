package JavaPrograms;

public class DuplicateOfArray {
    public static void main(String[] args) {
        int arr[]=new int[] {4,6,5,4,3,2,2,3,1};
        System.out.println("Duplicates element in an array are: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
