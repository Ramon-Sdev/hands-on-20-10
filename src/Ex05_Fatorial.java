public class Ex05_Fatorial {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            long fat = 1;
            StringBuilder expr = new StringBuilder();
            for (int i = n; i >= 1; i--) {
                fat *= i;
                expr.append(i);
                if (i > 1) expr.append(" × ");
            }
            System.out.println(n + "! = " + expr + " = " + fat);
        }
    }
}
