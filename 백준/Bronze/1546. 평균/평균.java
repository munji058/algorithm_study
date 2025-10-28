import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grade = new int[n];
        for (int i = 0; i < n; i++) { grade[i] = sc.nextInt(); }

        int max = grade[0];
        for (int i = 1; i < n; i++) {
            if(grade[i] > max)
                max = grade[i];
        }

        float[] forge_grade = new float[n];
        for (int i = 0; i < n; i++) {
            forge_grade[i] = (float)grade[i] / max * 100;
        }

        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += forge_grade[i];
        }

        System.out.println(sum/n);
    }
}
