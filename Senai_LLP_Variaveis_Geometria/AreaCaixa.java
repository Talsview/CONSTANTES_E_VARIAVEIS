import java.util.Scanner;

public class AreaCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões da caixa
        System.out.print("Informe o comprimento da caixa (em metros): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Informe a largura da caixa (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Informe a altura da caixa (em metros): ");
        double altura = scanner.nextDouble();

        // Calcula a área total da superfície da caixa (6 faces)
        double area = 2 * (comprimento * largura + comprimento * altura + largura * altura);

        System.out.printf("A área total da superfície da caixa é: %.2f metros quadrados.%n", area);

        scanner.close();
    }
}