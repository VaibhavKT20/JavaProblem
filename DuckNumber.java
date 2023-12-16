package JavaPrograms;

import java.util.Scanner;

public class DuckNumber {
    public static boolean checkDuckNumber(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(checkDuckNumber(num)?"Duck number":"Not a duck number");
    }
}
