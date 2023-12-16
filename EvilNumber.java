package JavaPrograms;

import java.util.Scanner;

public class EvilNumber {
    public static boolean checkEvilNumber(int n){
        long binaryNumber=FindBinary(n);
        int count=0;
        while(binaryNumber>0){
            if(binaryNumber%10==1){
                count++;
            }
            binaryNumber=binaryNumber/10;
        }
        if(binaryNumber%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static long FindBinary(int n){
        long binaryNumber=0;
        int rem=0;
        int j=1;
        while(n>0){
            rem=n%10;
            binaryNumber+=rem*j;
            n=n/10;
            j=j*10;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println(checkEvilNumber(n)?"Evil number":"Not a Evil number");
    }
}

