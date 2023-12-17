package JavaPrograms;

public class LargestOf3Number {
    public static void main(String[] args) {
        int a=70,b=50,c=90;
        if(a>b&&a>c){
            System.out.println("a is largest");
        }
        else if(b>a&&b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
