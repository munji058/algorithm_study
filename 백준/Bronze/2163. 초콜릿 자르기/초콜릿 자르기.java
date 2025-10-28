import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        if (n < m)
            count = (n-1) + n * (m-1);
        else
            count = (m-1) + m * (n-1);
        System.out.println(count);
    }
}
