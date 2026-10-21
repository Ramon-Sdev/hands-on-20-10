import java.util.Scanner;

public class Ex09_Eleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulos = 0, brancos = 0;
        System.out.print("Voto (1-4 candidatos, 5 nulo, 6 branco, 0 encerra): ");
        int voto = sc.nextInt();
        while (voto != 0) {
            switch (voto) {
                case 1 -> c1++;
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> nulos++;
                case 6 -> brancos++;
                default -> System.out.println("Código inválido, voto ignorado.");
            }
            System.out.print("Voto (1-4 candidatos, 5 nulo, 6 branco, 0 encerra): ");
            voto = sc.nextInt();
        }
        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);
        System.out.println("Candidato 4: " + c4);
        System.out.println("Nulos: " + nulos);
        System.out.println("Brancos: " + brancos);
    }
}
