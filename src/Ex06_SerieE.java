import java.util.Scanner;

public class Ex06_SerieE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        double e = 1;
        double fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
            e += 1.0 / fat;
        }
        System.out.printf("E = %.6f%n", e);
    }
}
