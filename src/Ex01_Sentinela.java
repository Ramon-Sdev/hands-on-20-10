import java.util.Scanner;

public class Ex01_Sentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean temValor = false;
        int maior = 0, menor = 0;
        System.out.print("Digite um número (0 encerra): ");
        int n = sc.nextInt();
        while (n != 0) {
            if (!temValor) {
                maior = n;
                menor = n;
                temValor = true;
            } else {
                if (n > maior) maior = n;
                if (n < menor) menor = n;
            }
            System.out.print("Digite um número (0 encerra): ");
            n = sc.nextInt();
        }
        if (temValor) {
            System.out.println("Maior = " + maior);
            System.out.println("Menor = " + menor);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}
