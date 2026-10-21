import java.util.Scanner;

public class Ex22_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de termos: ");
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long prox = a + b;
            a = b;
            b = prox;
        }
        System.out.println();
    }
}
