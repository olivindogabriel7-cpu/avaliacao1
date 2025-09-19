
import java.util.Scanner;

public class avaliacao2 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Converte a temperatura para Fahrenheit usando a fórmula: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;

        // Converte a temperatura para Kelvin usando a fórmula: K = C + 273.15
        double kelvin = celsius + 273.15;

        // Exibe os resultados na tela
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.1f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.1f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        // Fecha o Scanner
        scanner.close();
    }
}
