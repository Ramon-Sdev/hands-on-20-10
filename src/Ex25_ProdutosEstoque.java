import java.util.Scanner;

public class Ex25_ProdutosEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PRODUTOS = 12;
        double somaAdicionais = 0, maiorFinal = 0;
        for (int i = 1; i <= PRODUTOS; i++) {
            System.out.println("Produto " + i);
            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();
            char refrig;
            do {
                System.out.print("Precisa de refrigeração (S/N): ");
                refrig = Character.toUpperCase(sc.next().charAt(0));
            } while (refrig != 'S' && refrig != 'N');
            char cat;
            do {
                System.out.print("Categoria (A/L/V): ");
                cat = Character.toUpperCase(sc.next().charAt(0));
            } while (cat != 'A' && cat != 'L' && cat != 'V');

            double estocagem;
            if (preco <= 20) {
                estocagem = (cat == 'A') ? 2 : (cat == 'L') ? 3 : 4;
            } else if (preco <= 50) {
                estocagem = (refrig == 'S') ? 6 : 0;
            } else if (refrig == 'S') {
                estocagem = (cat == 'A') ? 5 : (cat == 'L') ? 2 : 4;
            } else {
                estocagem = (cat == 'L') ? 1 : 0;
            }

            double imposto = (cat == 'A' && refrig == 'S') ? 0.04 * preco : 0.02 * preco;
            double precoFinal = preco + estocagem + imposto;

            String classificacao;
            if (precoFinal <= 20) classificacao = "Barato";
            else if (precoFinal <= 100) classificacao = "Normal";
            else classificacao = "Caro";

            System.out.printf("Preço unitário: R$ %.2f%n", preco);
            System.out.printf("Custo de estocagem: R$ %.2f%n", estocagem);
            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
            System.out.println("Classificação: " + classificacao + "\n");

            somaAdicionais += estocagem + imposto;
            if (precoFinal > maiorFinal) maiorFinal = precoFinal;
        }
        System.out.printf("Média dos valores adicionais: R$ %.2f%n", somaAdicionais / PRODUTOS);
        System.out.printf("Maior preço final: R$ %.2f%n", maiorFinal);
    }
}
