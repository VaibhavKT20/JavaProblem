package JavaPrograms;

import java.util.Scanner;

public class checkPrime {
    public static void checkPrime(int n){
        int m=0,i,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println("Not a prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        checkPrime(n);
    }
}
