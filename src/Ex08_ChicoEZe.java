public class Ex08_ChicoEZe {
    public static void main(String[] args) {
        int chico = 150; // cm
        int ze = 110;    // cm
        int anos = 0;
        while (ze <= chico) {
            chico += 2;
            ze += 3;
            anos++;
        }
        System.out.println("Anos necessários: " + anos);
        System.out.printf("Altura final de Chico: %.2f m%n", chico / 100.0);
        System.out.printf("Altura final de Zé: %.2f m%n", ze / 100.0);
    }
}
