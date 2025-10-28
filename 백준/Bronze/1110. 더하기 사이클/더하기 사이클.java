import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int num = Integer.parseInt(s);
        int n = 1;

        while (true) {
            if (num / 10 == 0)
                num = num*10 + num;
            else
                num = (num%10)*10 + (num/10 + num%10)%10;

            if(num == Integer.parseInt(s))
                break;
            n++;
        }
        System.out.println(n);
    }
}
