package JavaPrograms;

public class GCD {
    public static void main(String[] args) {
        int n1=12,n2=4,temp,GCD=0;
        while(n2!=0){
            temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        GCD=n1;
        System.out.println("GCD of n1 and n2 is "+GCD);
    }
}
