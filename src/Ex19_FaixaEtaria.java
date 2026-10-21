import java.util.Scanner;

public class Ex19_FaixaEtaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL = 15;
        int[] faixas = new int[6]; // índices 1 a 5
        for (int i = 1; i <= TOTAL; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            if (idade <= 15) faixas[1]++;
            else if (idade <= 30) faixas[2]++;
            else if (idade <= 45) faixas[3]++;
            else if (idade <= 60) faixas[4]++;
            else faixas[5]++;
        }
        for (int f = 1; f <= 5; f++) {
            System.out.println("Faixa " + f + ": " + faixas[f] + " pessoa(s)");
        }
        System.out.printf("Percentual da primeira faixa: %.2f%%%n", 100.0 * faixas[1] / TOTAL);
        System.out.printf("Percentual da última faixa: %.2f%%%n", 100.0 * faixas[5] / TOTAL);
    }
}
