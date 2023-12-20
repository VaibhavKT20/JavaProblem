package JavaPrograms;

public class AcSortingArray {
    public static void main(String[] args) {
        int arr[]={20,3,1,4,9,11,0};
        System.out.print("Original Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\nSorted in ascending fashion: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
