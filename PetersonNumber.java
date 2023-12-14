package JavaPrograms;

import java.util.Scanner;

public class PetersonNumber {
    public static int factorialFind(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isPeterson(int n){
        int num=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=factorialFind(digit);
            n=n/10;
        }
        return (sum==num);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you a number you want to check whether the number is Peterson or not: ");
        int n=sc.nextInt();
        System.out.println(isPeterson(n)?"Peterson Number ":"Not a Peterson Number");
    }
}
