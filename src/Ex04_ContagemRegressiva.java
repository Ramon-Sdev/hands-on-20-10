import java.util.Scanner;

public class Ex04_ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        long soma = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println();
        System.out.println("Soma = " + soma);
    }
}
