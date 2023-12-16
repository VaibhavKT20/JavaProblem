package JavaPrograms;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        int n,num,firstHalf,secondHalf,digit=0,squareOfSum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        num=n;
        while(num>0){
            digit++;
            num=num/10;
        }
        if(digit%2==0){
            num=n;
            firstHalf=num%(int)(Math.pow(10,digit/2));
            secondHalf=num/(int)(Math.pow(10,digit/2));
            squareOfSum=(firstHalf+secondHalf)*(firstHalf+secondHalf);
            if(n==squareOfSum){
                System.out.println(n+" is a Tech number");
            }
            else{
                System.out.println(n+" is not a Tech number");
            }
        }
        else{
            System.out.println(n+" is not a Tech number");
        }


    }
}
