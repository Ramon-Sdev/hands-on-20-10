import java.util.Scanner;

public class Ex17_AcidentesTransito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CIDADES = 200;
        int maiorAcid = 0, menorAcid = 0, codMaior = 0, codMenor = 0;
        long somaVeiculos = 0;
        for (int i = 1; i <= CIDADES; i++) {
            System.out.println("Cidade " + i + " de " + CIDADES);
            System.out.print("Código da cidade: ");
            int codigo = sc.nextInt();
            System.out.print("Estado: ");
            String estado = sc.next();
            System.out.print("Número de veículos de passeio: ");
            int veiculos = sc.nextInt();
            System.out.print("Número de acidentes com vítimas: ");
            int acidentes = sc.nextInt();
            somaVeiculos += veiculos;
            if (i == 1 || acidentes > maiorAcid) {
                maiorAcid = acidentes;
                codMaior = codigo;
            }
            if (i == 1 || acidentes < menorAcid) {
                menorAcid = acidentes;
                codMenor = codigo;
            }
        }
        System.out.println("a) Maior número de acidentes: " + maiorAcid + " (cidade " + codMaior + ")");
        System.out.println("b) Menor número de acidentes: " + menorAcid + " (cidade " + codMenor + ")");
        System.out.printf("c) Média de veículos: %.2f%n", (double) somaVeiculos / CIDADES);
    }
}
