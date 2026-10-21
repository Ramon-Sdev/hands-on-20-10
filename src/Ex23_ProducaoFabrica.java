import java.util.Scanner;

public class Ex23_ProducaoFabrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double SALARIO_MINIMO = 1621.00;
        double folha = 0, maiorSalario = -1;
        int totalPecas = 0, pecasHomens = 0, pecasMulheres = 0;
        int homens = 0, mulheres = 0, operarioMaior = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Número do operário: ");
            int numero = sc.nextInt();
            System.out.print("Peças produzidas: ");
            int pecas = sc.nextInt();
            char sexo;
            do {
                System.out.print("Sexo (M/F): ");
                sexo = Character.toUpperCase(sc.next().charAt(0));
            } while (sexo != 'M' && sexo != 'F');

            double salario = SALARIO_MINIMO;
            if (pecas > 50) salario += 0.05 * SALARIO_MINIMO * (pecas - 30);
            else if (pecas > 30) salario += 0.03 * SALARIO_MINIMO * (pecas - 30);

            System.out.printf("a) Operário %d - salário: R$ %.2f%n", numero, salario);
            folha += salario;
            totalPecas += pecas;
            if (sexo == 'M') {
                homens++;
                pecasHomens += pecas;
            } else {
                mulheres++;
                pecasMulheres += pecas;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
                operarioMaior = numero;
            }
        }
        System.out.printf("b) Total da folha: R$ %.2f%n", folha);
        System.out.println("c) Total de peças produzidas: " + totalPecas);
        System.out.printf("d) Média de peças dos homens: %.2f%n", homens == 0 ? 0.0 : (double) pecasHomens / homens);
        System.out.printf("e) Média de peças das mulheres: %.2f%n", mulheres == 0 ? 0.0 : (double) pecasMulheres / mulheres);
        System.out.println("f) Operário com maior salário: " + operarioMaior);
    }
}
