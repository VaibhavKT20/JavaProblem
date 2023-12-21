package JavaPrograms;

import java.util.Arrays;

public class SortInJava {
    public static void main(String[] args) {
        int arr[]={12,32,11,14,2,15,64,1,78};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
