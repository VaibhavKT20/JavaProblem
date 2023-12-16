package JavaPrograms;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        int lastDigit;
        while(n>0){
            lastDigit=n%10;
            sum=sum+lastDigit;
            product=product*lastDigit;
            n=n/10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a Spy number");
        }

    }
}
