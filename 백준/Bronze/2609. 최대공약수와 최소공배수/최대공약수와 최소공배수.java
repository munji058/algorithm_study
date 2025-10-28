import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int d = gcd(n,m);
        System.out.println(d);
        System.out.println(n*m/d);
    }
    public static int gcd(int a,int b) {
        if(b == 0)
            return a;
        else
            return gcd(b,a % b);
    }
}