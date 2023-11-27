package JavaPrograms;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the factorial: ");
        int n=sc.nextInt();
        int fact=1;
        int i;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
