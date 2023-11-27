package JavaPrograms;

import java.util.Scanner;

public class fibonacciSeries {
    public static int fibonacciSeries(int n){
        if(n==0||n==1){
            return n;
        }
        else{
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print fibonacci series: ");
        int n=sc.nextInt();
        System.out.print("Fibonacci series is: ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
}
