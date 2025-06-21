import java.util.Scanner;

public class AreaBola {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da bola: ");
        double raio = scanner.nextDouble();

        double area = 4 * PI * Math.pow(raio, 2);

        System.out.printf("A área da superfície da bola é: %.2f\n", area);

        scanner.close();
    }
}