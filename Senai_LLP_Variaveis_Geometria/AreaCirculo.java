import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A área do círculo é: %.2f\n", area);

        scanner.close();
    }
}