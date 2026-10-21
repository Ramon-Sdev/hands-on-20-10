import java.util.Scanner;

public class Ex12_PesquisaPopulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorIdade = -1, mulheres = 0;
        System.out.print("Idade (-1 encerra): ");
        int idade = sc.nextInt();
        while (idade != -1) {
            System.out.print("Sexo (M/F): ");
            String sexo = sc.next().toUpperCase();
            System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
            String olhos = sc.next().toLowerCase();
            System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
            String cabelos = sc.next().toLowerCase();
            if (idade > maiorIdade) maiorIdade = idade;
            if (sexo.equals("F") && idade >= 18 && idade <= 35
                    && olhos.equals("verdes") && cabelos.equals("louros")) {
                mulheres++;
            }
            System.out.print("Idade (-1 encerra): ");
            idade = sc.nextInt();
        }
        if (maiorIdade == -1) {
            System.out.println("Nenhum habitante pesquisado.");
            return;
        }
        System.out.println("a) Maior idade: " + maiorIdade);
        System.out.println("b) Mulheres de 18 a 35 anos, olhos verdes e cabelos louros: " + mulheres);
    }
}
