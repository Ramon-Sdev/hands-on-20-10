import java.util.Scanner;

public class Ex15_SerieHarmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        double s = 0;
        StringBuilder termos = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
            termos.append(i == 1 ? "1" : "1/" + i);
            if (i < n) termos.append(" + ");
        }
        System.out.println(termos);
        System.out.printf("S = %.2f%n", s);
    }
}
