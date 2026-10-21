import java.util.Scanner;

public class Ex20_CalculoSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de termos: ");
        int termos = sc.nextInt();
        System.out.print("X (positivo): ");
        double x = sc.nextDouble();
        // Os denominadores seguem o padrão 1!, 2!, 3!, 4!, 3!, 2!, repetido a cada 6 termos.
        int[] padrao = {1, 2, 3, 4, 3, 2};
        double s = 0;
        for (int k = 1; k <= termos; k++) {
            double fat = 1;
            for (int i = 2; i <= padrao[(k - 1) % 6]; i++) {
                fat *= i;
            }
            double termo = Math.pow(x, k + 1) / fat;
            s += (k % 2 == 1) ? -termo : termo;
        }
        System.out.printf("S = %.6f%n", s);
    }
}
