import java.util.Scanner;

public class Ex03_SomaAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        long soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("Soma = " + soma);
    }
}
