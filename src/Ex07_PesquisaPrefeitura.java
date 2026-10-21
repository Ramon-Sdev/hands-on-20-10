import java.util.Scanner;

public class Ex07_PesquisaPrefeitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas = 0, ateCem = 0;
        double somaSalarios = 0, maior = 0;
        long somaFilhos = 0;
        System.out.print("Salário (negativo encerra): ");
        double salario = sc.nextDouble();
        while (salario >= 0) {
            System.out.print("Número de filhos: ");
            int filhos = sc.nextInt();
            pessoas++;
            somaSalarios += salario;
            somaFilhos += filhos;
            if (salario > maior) maior = salario;
            if (salario <= 100) ateCem++;
            System.out.print("Salário (negativo encerra): ");
            salario = sc.nextDouble();
        }
        if (pessoas == 0) {
            System.out.println("Nenhum habitante informado.");
            return;
        }
        System.out.printf("a) Média salarial: R$ %.2f%n", somaSalarios / pessoas);
        System.out.printf("b) Média de filhos: %.2f%n", (double) somaFilhos / pessoas);
        System.out.printf("c) Maior salário: R$ %.2f%n", maior);
        System.out.printf("d) Pessoas com salário até R$ 100,00: %.2f%%%n", 100.0 * ateCem / pessoas);
    }
}
