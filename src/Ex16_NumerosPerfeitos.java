public class Ex16_NumerosPerfeitos {
    public static void main(String[] args) {
        // O quinto número perfeito é 33550336; a soma dos divisores próprios
        // de todos os números até o limite é calculada por crivo.
        final int LIMITE = 33_550_336;
        int[] somaDivisores = new int[LIMITE + 1];
        for (int d = 1; d <= LIMITE / 2; d++) {
            for (int m = 2 * d; m <= LIMITE; m += d) {
                somaDivisores[m] += d;
            }
        }
        int achados = 0;
        for (int n = 2; n <= LIMITE && achados < 5; n++) {
            if (somaDivisores[n] == n) {
                System.out.println(n);
                achados++;
            }
        }
    }
}
