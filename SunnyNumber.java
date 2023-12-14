package JavaPrograms;

import java.util.Scanner;
import java.math.*;

public class SunnyNumber {
    public static boolean FindperfectSqaure(int n){
        double sqaureRoot=Math.sqrt(n);
        return ((sqaureRoot-Math.floor(sqaureRoot))==0);
    }
    public static void checkSunnyNum(int N){
        if(FindperfectSqaure(N+1)){
            System.out.println("The number is SunnyNumber");
        }
        else{
            System.out.println("The number is not a sunny number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        checkSunnyNum(n);
    }

}
