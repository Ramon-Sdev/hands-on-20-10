import java.util.Scanner;

public class Ex21_FolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double SALARIO_MINIMO = 1621.00;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Funcionário " + i);
            System.out.print("Código: ");
            int codigo = sc.nextInt();
            System.out.print("Horas trabalhadas no mês: ");
            double horas = sc.nextDouble();
            char turno;
            do {
                System.out.print("Turno (M/V/N): ");
                turno = Character.toUpperCase(sc.next().charAt(0));
            } while (turno != 'M' && turno != 'V' && turno != 'N');
            char categoria;
            do {
                System.out.print("Categoria (O/G): ");
                categoria = Character.toUpperCase(sc.next().charAt(0));
            } while (categoria != 'O' && categoria != 'G');

            double percentual;
            if (categoria == 'G') percentual = (turno == 'N') ? 0.18 : 0.15;
            else percentual = (turno == 'N') ? 0.13 : 0.10;
            double valorHora = percentual * SALARIO_MINIMO;
            double salarioInicial = horas * valorHora;

            double auxilio;
            if (salarioInicial <= 1080.00) auxilio = 0.20 * salarioInicial;
            else if (salarioInicial <= 2160.00) auxilio = 0.15 * salarioInicial;
            else auxilio = 0.05 * salarioInicial;

            System.out.println("Código: " + codigo);
            System.out.printf("Horas trabalhadas: %.2f%n", horas);
            System.out.printf("Valor da hora: R$ %.2f%n", valorHora);
            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
            System.out.printf("Auxílio-alimentação: R$ %.2f%n", auxilio);
            System.out.printf("Salário final: R$ %.2f%n%n", salarioInicial + auxilio);
        }
    }
}
