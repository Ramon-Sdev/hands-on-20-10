import java.util.Scanner;

public class Ex24_MortalidadeInfantil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de crianças nascidas no período: ");
        int total = sc.nextInt();
        int fem = 0, masc = 0, femMortas = 0, mascMortos = 0, ate24 = 0;
        for (int i = 1; i <= total; i++) {
            char sexo;
            do {
                System.out.print("Criança " + i + " - sexo (M/F): ");
                sexo = Character.toUpperCase(sc.next().charAt(0));
            } while (sexo != 'M' && sexo != 'F');
            System.out.print("Tempo de vida em meses (-1 se ainda vive): ");
            int meses = sc.nextInt();
            boolean morreu = meses >= 0;
            if (sexo == 'F') {
                fem++;
                if (morreu) femMortas++;
            } else {
                masc++;
                if (morreu) mascMortos++;
            }
            if (morreu && meses <= 24) ate24++;
        }
        if (total == 0) {
            System.out.println("Nenhuma criança informada.");
            return;
        }
        // Percentuais por sexo são calculados sobre o total de crianças daquele sexo.
        System.out.printf("a) Meninas que morreram: %.2f%%%n", fem == 0 ? 0.0 : 100.0 * femMortas / fem);
        System.out.printf("b) Meninos que morreram: %.2f%%%n", masc == 0 ? 0.0 : 100.0 * mascMortos / masc);
        System.out.printf("c) Crianças que viveram 24 meses ou menos: %.2f%%%n", 100.0 * ate24 / total);
    }
}
