package JavaPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int sqaure=n*n;
        while(sqaure>0){
            int digit=sqaure%10;
            sum=sum+digit;
            sqaure=sqaure/10;
        }
        if(n==sum){
            System.out.println(n+" is a neon number.");
        }
        else{
            System.out.println(n+" is not a neon number.");
        }

    }
}
