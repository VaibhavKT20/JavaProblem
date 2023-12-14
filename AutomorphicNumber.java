package JavaPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int n){
        int square=n*n;
        if(n%10!=square%10){
            return false;
        }
        n=n/10;
        square=square/10;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(isAutomorphic(n)?"Automorphic":"Not Automorphic");
    }
}
