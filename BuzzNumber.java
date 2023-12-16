package JavaPrograms;

import java.util.Scanner;

public class BuzzNumber {
    public static boolean checkBuzzNumber(int num){
        if(num%10==7||num%7==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        System.out.println(checkBuzzNumber(n)?"Buzz Number":"Not a buzz number");
    }
}
