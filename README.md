# hands-on-20-10
atividade da faculdade 


## Atividades de estruturas de repetição
```
javac -encoding UTF-8 -d out src/*.java
java -cp out Ex01_Sentinela
```

| # | Programa | Descrição |
|---|----------|-----------|
| 1 | Ex01_Sentinela | Maior e menor valor (para com 0) |
| 2 | Ex02_ContagemValores | Positivos, negativos e zeros em 10 números |
| 3 | Ex03_SomaAteN | Soma de 1 até N |
| 4 | Ex04_ContagemRegressiva | Contagem regressiva e soma |
| 5 | Ex05_Fatorial | Fatoriais de 1 a 10 |
| 6 | Ex06_SerieE | Série E = 1 + 1/1! + ... + 1/N! |
| 7 | Ex07_PesquisaPrefeitura | Médias, maior salário e percentual até R$ 100 |
| 8 | Ex08_ChicoEZe | Anos para Zé ultrapassar Chico |
| 9 | Ex09_Eleicao | Apuração de votos |
| 10 | Ex10_ProgressaoAritmetica | Termos e soma de uma PA |
| 11 | Ex11_Tabuada | Tabuada de 1 até N para 20 números |
| 12 | Ex12_PesquisaPopulacao | Maior idade e mulheres de olhos verdes e cabelos louros |
| 13 | Ex13_AtualizacaoPrecos | Aumento de 20% e médias |
| 14 | Ex14_Entre1000e1999 | Números com resto 5 na divisão por 11 |
| 15 | Ex15_SerieHarmonica | Soma 1 + 1/2 + ... + 1/N |
| 16 | Ex16_NumerosPerfeitos | Cinco primeiros números perfeitos |
| 17 | Ex17_AcidentesTransito | Estatística de acidentes em 200 cidades |
| 18 | Ex18_ConceitoAlunos | Conceito final de 75 alunos |
| 19 | Ex19_FaixaEtaria | Faixas etárias de 15 pessoas |
| 20 | Ex20_CalculoSerie | Série com fatoriais em zigue-zague |
| 21 | Ex21_FolhaPagamento | Folha de pagamento de 10 funcionários |
| 22 | Ex22_Fibonacci | n primeiros termos de Fibonacci |
| 23 | Ex23_ProducaoFabrica | Produção e salários de 15 operários |
| 24 | Ex24_MortalidadeInfantil | Percentuais de mortalidade infantil |
| 25 | Ex25_ProdutosEstoque | Custos, imposto e classificação de 12 produtos |

### Decisões de interpretação
- Ex18: nota 9 e 7 entram no conceito B; 5 até menos de 7 é C.
- Ex23: salário mínimo de R$ 1621,00 (o mesmo do exercício 21).
- Ex24: tempo de vida em meses; digite `-1` se a criança ainda vive. Percentuais por sexo são sobre o total de crianças do mesmo sexo.

- import java.util.Scanner;

/** Utilitário de leitura compartilhado pelos exercícios (aceita vírgula ou ponto nos decimais). */
public class Entrada {
    private static final Scanner sc = new Scanner(System.in);

    public static int lerInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente.");
            }
        }
    }

    public static double lerDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente.");
            }
        }
    }

    /** Lê um texto e devolve em maiúsculas, sem espaços nas pontas. */
    public static String lerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim().toUpperCase();
    }

    /** Lê um texto até que seja um dos valores válidos (comparação em maiúsculas). */
    public static String lerOpcao(String msg, String... validos) {
        while (true) {
            String s = lerTexto(msg);
            for (String v : validos) {
                if (v.equals(s)) return s;
            }
            System.out.println("Opção inválida.");
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex01.java
public class Ex01 {
    public static void main(String[] args) {
        int maior = 0, menor = 0;
        boolean primeiro = true;
        while (true) {
            int n = Entrada.lerInt("Número (0 para encerrar): ");
            if (n == 0) break;
            if (primeiro) {
                maior = menor = n;
                primeiro = false;
            } else {
                if (n > maior) maior = n;
                if (n < menor) menor = n;
            }
        }
        if (primeiro) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            System.out.println("Maior = " + maior);
            System.out.println("Menor = " + menor);
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex02.java
public class Ex02 {
    public static void main(String[] args) {
        int pos = 0, neg = 0, zeros = 0;
        for (int i = 1; i <= 10; i++) {
            int n = Entrada.lerInt("Número " + i + ": ");
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else zeros++;
        }
        System.out.println("Positivos = " + pos);
        System.out.println("Negativos = " + neg);
        System.out.println("Zeros = " + zeros);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex03.java
public class Ex03 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("N (inteiro positivo): ");
        } while (n <= 0);
        long soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        System.out.println("Soma = " + soma);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex04.java
public class Ex04 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("N (inteiro positivo): ");
        } while (n <= 0);
        long soma = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            sb.append(i).append(' ');
            soma += i;
        }
        System.out.println(sb.toString().trim());
        System.out.println("Soma = " + soma);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex05.java
public class Ex05 {
    public static void main(String[] args) {
        long fat = 1;
        for (int n = 1; n <= 10; n++) {
            fat *= n;
            System.out.println(n + "! = " + fat);
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex06.java
public class Ex06 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("N (inteiro positivo): ");
        } while (n <= 0);
        double e = 1;
        double fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
            e += 1.0 / fat;
        }
        System.out.printf("E = %.6f%n", e);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex07.java
public class Ex07 {
    public static void main(String[] args) {
        int pessoas = 0, ate100 = 0, totalFilhos = 0;
        double totalSalarios = 0, maior = 0;
        while (true) {
            double salario = Entrada.lerDouble("Salário (negativo para encerrar): ");
            if (salario < 0) break;
            int filhos = Entrada.lerInt("Número de filhos: ");
            pessoas++;
            totalSalarios += salario;
            totalFilhos += filhos;
            if (salario > maior) maior = salario;
            if (salario <= 100) ate100++;
        }
        if (pessoas == 0) {
            System.out.println("Nenhum habitante informado.");
            return;
        }
        System.out.printf("a) Média salarial = R$ %.2f%n", totalSalarios / pessoas);
        System.out.printf("b) Média de filhos = %.2f%n", (double) totalFilhos / pessoas);
        System.out.printf("c) Maior salário = R$ %.2f%n", maior);
        System.out.printf("d) Pessoas com salário até R$ 100,00 = %.2f%%%n", 100.0 * ate100 / pessoas);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex08.java
public class Ex08 {
    public static void main(String[] args) {
        // alturas em centímetros para evitar erros de ponto flutuante
        int chico = 150, ze = 110, anos = 0;
        while (ze <= chico) {
            chico += 2;
            ze += 3;
            anos++;
        }
        System.out.println("Anos necessários = " + anos);
        System.out.printf("Altura final de Chico = %.2f m%n", chico / 100.0);
        System.out.printf("Altura final de Zé = %.2f m%n", ze / 100.0);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex09.java
public class Ex09 {
    public static void main(String[] args) {
        int[] votos = new int[7]; // índices 1 a 6
        System.out.println("1-4: candidatos | 5: nulo | 6: branco | 0: encerrar");
        while (true) {
            int codigo = Entrada.lerInt("Voto: ");
            if (codigo == 0) break;
            if (codigo < 1 || codigo > 6) {
                System.out.println("Código inválido (não contabilizado).");
                continue;
            }
            votos[codigo]++;
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println("Candidato " + i + " = " + votos[i]);
        }
        System.out.println("Nulos = " + votos[5]);
        System.out.println("Brancos = " + votos[6]);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex10.java
public class Ex10 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("N (quantidade de termos): ");
        } while (n <= 0);
        double a1 = Entrada.lerDouble("A1 (primeiro termo): ");
        double r = Entrada.lerDouble("R (razão): ");

        StringBuilder sb = new StringBuilder();
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            double an = a1 + (i - 1) * r;
            sb.append(fmt(an)).append(' ');
            soma += an;
        }
        System.out.println("PA:");
        System.out.println(sb.toString().trim());
        System.out.println("Soma = " + fmt(soma));
    }

    private static String fmt(double v) {
        return v == Math.rint(v) ? String.valueOf((long) v) : String.valueOf(v);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex11.java
public class Ex11 {
    public static void main(String[] args) {
        for (int k = 1; k <= 20; k++) {
            int n = Entrada.lerInt("Número " + k + ": ");
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex12.java
public class Ex12 {
    public static void main(String[] args) {
        int maiorIdade = -1, mulheres = 0;
        while (true) {
            int idade = Entrada.lerInt("Idade (-1 para encerrar): ");
            if (idade == -1) break;
            String sexo = Entrada.lerOpcao("Sexo (M/F): ", "M", "F");
            String olhos = Entrada.lerOpcao("Olhos (AZUIS/VERDES/CASTANHOS): ", "AZUIS", "VERDES", "CASTANHOS");
            String cabelos = Entrada.lerOpcao("Cabelos (LOUROS/CASTANHOS/PRETOS): ", "LOUROS", "CASTANHOS", "PRETOS");

            if (idade > maiorIdade) maiorIdade = idade;
            if (sexo.equals("F") && idade >= 18 && idade <= 35
                    && olhos.equals("VERDES") && cabelos.equals("LOUROS")) {
                mulheres++;
            }
        }
        if (maiorIdade == -1) {
            System.out.println("Nenhum habitante pesquisado.");
            return;
        }
        System.out.println("a) Maior idade = " + maiorIdade);
        System.out.println("b) Mulheres (18-35 anos, olhos verdes, cabelos louros) = " + mulheres);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex13.java
public class Ex13 {
    public static void main(String[] args) {
        int qtd = 0;
        double somaAntes = 0, somaDepois = 0;
        while (true) {
            int codigo = Entrada.lerInt("Código do produto (negativo para encerrar): ");
            if (codigo < 0) break;
            double preco = Entrada.lerDouble("Preço atual: ");
            double novo = preco * 1.20;
            System.out.printf("Código %d - novo preço: R$ %.2f%n", codigo, novo);
            qtd++;
            somaAntes += preco;
            somaDepois += novo;
        }
        if (qtd == 0) {
            System.out.println("Nenhum produto informado.");
            return;
        }
        System.out.printf("Média antes do aumento = R$ %.2f%n", somaAntes / qtd);
        System.out.printf("Média após o aumento = R$ %.2f%n", somaDepois / qtd);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex14.java
public class Ex14 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) System.out.println(i);
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex15.java
public class Ex15 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("N (inteiro positivo): ");
        } while (n <= 0);
        double s = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
            if (i > 1) sb.append(" + ");
            sb.append("1/").append(i);
        }
        System.out.println(sb);
        System.out.printf("S = %.2f%n", s);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex16.java
public class Ex16 {
    public static void main(String[] args) {
        // Testar todos os números até 33.550.336 seria lento; usamos a forma de Euclides:
        // 2^(p-1) * (2^p - 1) é perfeito quando 2^p - 1 é primo. Cada candidato é confirmado
        // somando os divisores de verdade.
        int achados = 0;
        for (int p = 2; achados < 5; p++) {
            long primo = (1L << p) - 1;
            if (!ehPrimo(primo)) continue;
            long candidato = (1L << (p - 1)) * primo;
            if (ehPerfeito(candidato)) {
                achados++;
                System.out.println(candidato);
            }
        }
    }

    static boolean ehPrimo(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean ehPerfeito(long n) {
        long soma = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                soma += i;
                if (i != n / i) soma += n / i;
            }
        }
        return n > 1 && soma == n;
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex17.java
public class Ex17 {
    public static void main(String[] args) {
        int maiorAc = 0, menorAc = 0, codMaior = 0, codMenor = 0;
        double somaVeiculos = 0;
        for (int i = 1; i <= 200; i++) {
            System.out.println("--- Cidade " + i + " ---");
            int codigo = Entrada.lerInt("Código da cidade: ");
            String estado = Entrada.lerTexto("Estado: ");
            int veiculos = Entrada.lerInt("Veículos de passeio: ");
            int acidentes = Entrada.lerInt("Acidentes com vítimas: ");

            somaVeiculos += veiculos;
            if (i == 1 || acidentes > maiorAc) {
                maiorAc = acidentes;
                codMaior = codigo;
            }
            if (i == 1 || acidentes < menorAc) {
                menorAc = acidentes;
                codMenor = codigo;
            }
        }
        System.out.println("a) Maior número de acidentes = " + maiorAc + " (cidade " + codMaior + ")");
        System.out.println("b) Menor número de acidentes = " + menorAc + " (cidade " + codMenor + ")");
        System.out.printf("c) Média de veículos = %.2f%n", somaVeiculos / 200);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex18.java
public class Ex18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 75; i++) {
            System.out.println("--- Aluno " + i + " ---");
            int matricula = Entrada.lerInt("Matrícula: ");
            double nota = Entrada.lerDouble("Nota final: ");
            String conceito;
            if (nota > 9) conceito = "A";
            else if (nota >= 7) conceito = "B";
            else if (nota >= 5) conceito = "C";
            else conceito = "D";
            System.out.println("Matrícula: " + matricula);
            System.out.printf("Nota final: %.2f%n", nota);
            System.out.println("Conceito: " + conceito);
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex19.java
public class Ex19 {
    public static void main(String[] args) {
        int[] faixas = new int[6]; // índices 1 a 5
        int total = 15;
        for (int i = 1; i <= total; i++) {
            int idade;
            do {
                idade = Entrada.lerInt("Idade da pessoa " + i + ": ");
            } while (idade < 0);
            if (idade <= 15) faixas[1]++;
            else if (idade <= 30) faixas[2]++;
            else if (idade <= 45) faixas[3]++;
            else if (idade <= 60) faixas[4]++;
            else faixas[5]++;
        }
        String[] nomes = {"", "Até 15 anos", "16 a 30 anos", "31 a 45 anos", "46 a 60 anos", "61 anos ou mais"};
        System.out.println("a) Quantidade por faixa:");
        for (int f = 1; f <= 5; f++) {
            System.out.println("   Faixa " + f + " (" + nomes[f] + ") = " + faixas[f]);
        }
        System.out.printf("b) Percentual da primeira faixa = %.2f%%%n", 100.0 * faixas[1] / total);
        System.out.printf("c) Percentual da última faixa = %.2f%%%n", 100.0 * faixas[5] / total);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex20.java
public class Ex20 {
    public static void main(String[] args) {
        int termos;
        do {
            termos = Entrada.lerInt("Quantidade de termos: ");
        } while (termos <= 0);
        double x;
        do {
            x = Entrada.lerDouble("X (positivo): ");
        } while (x <= 0);

        // Termo k: sinal (-1)^k, numerador X^(k+1), denominador f! onde f repete 1 2 3 4 3 2
        int[] padrao = {1, 2, 3, 4, 3, 2};
        double s = 0;
        for (int k = 1; k <= termos; k++) {
            double num = Math.pow(x, k + 1);
            double den = fatorial(padrao[(k - 1) % 6]);
            double termo = num / den;
            s += (k % 2 == 1) ? -termo : termo;
        }
        System.out.printf("S = %.4f%n", s);
    }

    static double fatorial(int n) {
        double f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex21.java
public class Ex21 {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1621.00;
        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Funcionário " + i + " ---");
            int codigo = Entrada.lerInt("Código: ");
            double horas = Entrada.lerDouble("Horas trabalhadas no mês: ");
            String turno = Entrada.lerOpcao("Turno (M/V/N): ", "M", "V", "N");
            String categoria = Entrada.lerOpcao("Categoria (O/G): ", "O", "G");

            double percentual;
            if (categoria.equals("G")) {
                percentual = turno.equals("N") ? 0.18 : 0.15;
            } else {
                percentual = turno.equals("N") ? 0.13 : 0.10;
            }
            double valorHora = SALARIO_MINIMO * percentual;
            double salarioInicial = horas * valorHora;

            double auxilio;
            if (salarioInicial <= 1080.00) auxilio = salarioInicial * 0.20;
            else if (salarioInicial <= 2160.00) auxilio = salarioInicial * 0.15;
            else auxilio = salarioInicial * 0.05;

            double salarioFinal = salarioInicial + auxilio;

            System.out.println("Código: " + codigo);
            System.out.printf("Horas trabalhadas: %.2f%n", horas);
            System.out.printf("Valor da hora: R$ %.2f%n", valorHora);
            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
            System.out.printf("Auxílio-alimentação: R$ %.2f%n", auxilio);
            System.out.printf("Salário final: R$ %.2f%n", salarioFinal);
        }
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex22.java
public class Ex22 {
    public static void main(String[] args) {
        int n;
        do {
            n = Entrada.lerInt("Quantidade de termos (n): ");
        } while (n <= 0);
        long a = 0, b = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(a).append(' ');
            long prox = a + b;
            a = b;
            b = prox;
        }
        System.out.println(sb.toString().trim());
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex23.java
public class Ex23 {
    public static void main(String[] args) {
        final double SALARIO_MINIMO = 1621.00;
        double folha = 0, maiorSalario = -1;
        int pecasTotal = 0, pecasHomens = 0, pecasMulheres = 0, homens = 0, mulheres = 0, numMaior = 0;
        String sexoMaior = "";

        for (int i = 1; i <= 15; i++) {
            System.out.println("--- Operário " + i + " ---");
            int numero = Entrada.lerInt("Número do operário: ");
            int pecas = Entrada.lerInt("Peças produzidas no mês: ");
            String sexo = Entrada.lerOpcao("Sexo (M/F): ", "M", "F");

            double salario;
            if (pecas <= 30) {
                salario = SALARIO_MINIMO;
            } else if (pecas <= 50) {
                salario = SALARIO_MINIMO + 0.03 * SALARIO_MINIMO * (pecas - 30);
            } else {
                salario = SALARIO_MINIMO + 0.05 * SALARIO_MINIMO * (pecas - 30);
            }

            System.out.printf("Operário %d - salário: R$ %.2f%n", numero, salario);

            folha += salario;
            pecasTotal += pecas;
            if (sexo.equals("M")) {
                homens++;
                pecasHomens += pecas;
            } else {
                mulheres++;
                pecasMulheres += pecas;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
                numMaior = numero;
                sexoMaior = sexo;
            }
        }

        System.out.printf("b) Total da folha de pagamento = R$ %.2f%n", folha);
        System.out.println("c) Total de peças produzidas = " + pecasTotal);
        if (homens > 0) System.out.printf("d) Média de peças (homens) = %.2f%n", (double) pecasHomens / homens);
        else System.out.println("d) Não há homens na lista.");
        if (mulheres > 0) System.out.printf("e) Média de peças (mulheres) = %.2f%n", (double) pecasMulheres / mulheres);
        else System.out.println("e) Não há mulheres na lista.");
        System.out.println("f) Maior salário: " + (sexoMaior.equals("M") ? "operário " : "operária ")
                + numMaior + " (R$ " + String.format("%.2f", maiorSalario) + ")");
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex24.java
public class Ex24 {
    public static void main(String[] args) {
        int total;
        do {
            total = Entrada.lerInt("Quantidade de crianças nascidas no período: ");
        } while (total <= 0);

        int nascF = 0, nascM = 0, morrF = 0, morrM = 0, ate24 = 0;
        for (int i = 1; i <= total; i++) {
            System.out.println("--- Criança " + i + " ---");
            String sexo = Entrada.lerOpcao("Sexo (M/F): ", "M", "F");
            String morreu = Entrada.lerOpcao("Morreu no período? (S/N): ", "S", "N");
            int meses;
            do {
                meses = Entrada.lerInt("Tempo de vida (em meses): ");
            } while (meses < 0);

            if (sexo.equals("F")) nascF++;
            else nascM++;

            if (morreu.equals("S")) {
                if (sexo.equals("F")) morrF++;
                else morrM++;
                if (meses <= 24) ate24++;
            }
        }
        // Percentuais em relação ao total de crianças do respectivo grupo
        System.out.printf("a) Meninas que morreram = %.2f%% das meninas%n", nascF == 0 ? 0 : 100.0 * morrF / nascF);
        System.out.printf("b) Meninos que morreram = %.2f%% dos meninos%n", nascM == 0 ? 0 : 100.0 * morrM / nascM);
        System.out.printf("c) Viveram 24 meses ou menos (e morreram) = %.2f%% do total%n", 100.0 * ate24 / total);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\src\
Ex25.java
public class Ex25 {
    public static void main(String[] args) {
        int barato = 0, normal = 0, caro = 0;
        double somaAdicionais = 0, totalImpostos = 0;
        double maiorFinal = 0, menorFinal = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("--- Produto " + i + " ---");
            double preco = Entrada.lerDouble("Preço unitário: ");
            String refrig = Entrada.lerOpcao("Necessita refrigeração? (S/N): ", "S", "N");
            String cat = Entrada.lerOpcao("Categoria (A/L/V): ", "A", "L", "V");

            double custo;
            if (preco <= 20) {
                custo = cat.equals("A") ? 2 : cat.equals("L") ? 3 : 4;
            } else if (preco <= 50) {
                custo = refrig.equals("S") ? 6 : 0;
            } else if (refrig.equals("S")) {
                custo = cat.equals("A") ? 5 : cat.equals("L") ? 2 : 4;
            } else {
                custo = cat.equals("L") ? 1 : 0;
            }

            double imposto = (cat.equals("A") && refrig.equals("S")) ? preco * 0.04 : preco * 0.02;
            double precoFinal = preco + custo + imposto;

            String classificacao;
            if (precoFinal <= 20) {
                classificacao = "Barato";
                barato++;
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
                normal++;
            } else {
                classificacao = "Caro";
                caro++;
            }

            System.out.printf("Preço unitário: R$ %.2f%n", preco);
            System.out.printf("Custo de estocagem: R$ %.2f%n", custo);
            System.out.printf("Imposto: R$ %.2f%n", imposto);
            System.out.printf("Preço final: R$ %.2f%n", precoFinal);
            System.out.println("Classificação: " + classificacao);

            somaAdicionais += custo + imposto;
            totalImpostos += imposto;
            if (i == 1 || precoFinal > maiorFinal) maiorFinal = precoFinal;
            if (i == 1 || precoFinal < menorFinal) menorFinal = precoFinal;
        }

        System.out.println("======== Resumo ========");
        System.out.printf("Média dos valores adicionais (custo + imposto) = R$ %.2f%n", somaAdicionais / 12);
        System.out.printf("Maior preço final = R$ %.2f%n", maiorFinal);
        System.out.printf("Menor preço final = R$ %.2f%n", menorFinal);
        System.out.printf("Total de impostos = R$ %.2f%n", totalImpostos);
        System.out.println("Baratos = " + barato);
        System.out.println("Normais = " + normal);
        System.out.println("Caros = " + caro);
    }
}
C:\Users\Ramon\AppData\Local\Claude-Data\claude_pzs8sxrjxfjjc\scratch-workspaces\107b5953-4622-4248-b0a8-45e2e60b7451\c27a38bc-9107-44e2-9a3b-264b2c7a75d3\scratch-2026-10-21-597139\atividade-java\
README.md
# Atividade – Estruturas de Repetição (Java)

25 exercícios, um arquivo por exercício em `src/` (`Ex01.java` … `Ex25.java`).
`Entrada.java` é um utilitário de leitura usado por todos eles.

## Como executar

```bash
cd src
javac *.java
java Ex01
```

## Decisões de interpretação

- **Ex. 16:** os cinco primeiros números perfeitos (6, 28, 496, 8128, 33550336) são obtidos pela forma de Euclides, e cada um é confirmado somando os divisores.
- **Ex. 20:** o fatorial do denominador segue o padrão 1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2…; o sinal alterna começando negativo.
- **Ex. 24:** além de sexo e tempo de vida (meses), o programa pergunta se a criança morreu no período. Os percentuais por sexo são calculados sobre o total de crianças daquele sexo; o item (c) conta quem morreu com 24 meses ou menos, sobre o total de nascidas.
- **Ex. 21 e 23:** salário mínimo de R$ 1.621,00.
