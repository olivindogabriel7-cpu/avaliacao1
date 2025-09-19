import java.util.Scanner;

public class avaliacao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Receber as notas
        System.out.println("Digite as notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double bim1 = (notas[0] + notas[1]) / 2;
        double bim2 = (notas[2] + notas[3]) / 2;
        double bim3 = (notas[4] + notas[5]) / 2;
        double bim4 = (notas[6] + notas[7]) / 2;

        // Médias semestrais
        double semestre1 = (bim1 + bim2) / 2;
        double semestre2 = (bim3 + bim4) / 2;

        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Exibição dos resultados
        System.out.println("\n--- Resultados ---");
        System.out.printf("1º Bimestre: %.1f\n", bim1);
        System.out.printf("2º Bimestre: %.1f\n", bim2);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.println("------------------");
        System.out.printf("3º Bimestre: %.1f\n", bim3);
        System.out.printf("4º Bimestre: %.1f\n", bim4);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.println("------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}