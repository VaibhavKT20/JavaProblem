package JavaPrograms;

public class DisplayEvenOddNumber {
    public static void main(String[] args) {
        int number=100;
        System.out.print("Even numbers :");
        for(int i=1;i<=100;i++){
            if(i%2==0) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.print("Odd numbers :");
        for(int i=1;i<=100;i++){
            if(i%2!=0) {
                System.out.print(" " + i);
            }
        }

    }
}
