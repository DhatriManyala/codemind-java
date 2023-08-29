import java.util.Scanner;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,M;
        N=sc.nextInt();
        M=sc.nextInt();
        double a = (N+M)/2.0;
        System.out.printf("%.4f",a);
    }
}