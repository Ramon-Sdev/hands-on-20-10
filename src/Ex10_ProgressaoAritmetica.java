import java.util.Scanner;

public class Ex10_ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N (quantidade de termos): ");
        int n = sc.nextInt();
        System.out.print("A1 (primeiro termo): ");
        int a1 = sc.nextInt();
        System.out.print("R (razão): ");
        int r = sc.nextInt();
        System.out.println("PA:");
        for (int i = 1; i <= n; i++) {
            System.out.print((a1 + (i - 1) * r) + " ");
        }
        System.out.println();
        int an = a1 + (n - 1) * r;
        long soma = (long) n * (a1 + an) / 2;
        System.out.println("Soma = " + soma);
    }
}
