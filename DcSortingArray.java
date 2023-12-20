package JavaPrograms;

public class DcSortingArray {
    public static void main(String[] args) {
        int arr[]={12,2,3,14,64,23,1,11};
        System.out.print("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nSorting in descending fashion: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
