package JavaPrograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int sum=0,temp,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a palindrome number");
        }
        else{
            System.out.println(temp+" is not a palindrome number");
        }

    }
}
