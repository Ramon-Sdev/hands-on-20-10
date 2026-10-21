import java.util.Scanner;

public class Ex13_AtualizacaoPrecos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        double somaAntes = 0, somaDepois = 0;
        System.out.print("Código do produto (negativo encerra): ");
        int codigo = sc.nextInt();
        while (codigo >= 0) {
            System.out.print("Preço atual: ");
            double preco = sc.nextDouble();
            double novo = preco * 1.20;
            System.out.printf("Código %d - novo preço: R$ %.2f%n", codigo, novo);
            qtd++;
            somaAntes += preco;
            somaDepois += novo;
            System.out.print("Código do produto (negativo encerra): ");
            codigo = sc.nextInt();
        }
        if (qtd == 0) {
            System.out.println("Nenhum produto informado.");
            return;
        }
        System.out.printf("Média antes do aumento: R$ %.2f%n", somaAntes / qtd);
        System.out.printf("Média após o aumento: R$ %.2f%n", somaDepois / qtd);
    }
}
