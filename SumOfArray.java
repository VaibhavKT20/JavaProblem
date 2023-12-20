package JavaPrograms;

public class SumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {10, 2, 3, 4, 1};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array is :"+sum);
    }
}