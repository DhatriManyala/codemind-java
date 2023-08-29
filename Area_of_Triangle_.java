import java.util.Scanner;
public class area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s = (a+b+c)/2.0;
        double A = s*(s-a)*(s-b)*(s-c);
        double B = Math.sqrt(A);
        System.out.printf("%.2f",B);
    }
}