import java.util.Scanner;

public class Ex11_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int k = 1; k <= 20; k++) {
            System.out.print("Número " + k + ": ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}
