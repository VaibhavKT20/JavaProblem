package JavaPrograms;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want to print pattern: ");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(k=i;k<n;k++){
                    System.out.print("*"+" ");
                }
            System.out.println();
            }

        for(i=n;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(k=i;k<n;k++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }
}
