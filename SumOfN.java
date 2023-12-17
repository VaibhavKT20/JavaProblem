package JavaPrograms;

public class SumOfN {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum is "+sum);

        //Method 2
        int sum2 = n*(n+1)/2;
        System.out.println("Sum is:"+sum2);
    }
}

