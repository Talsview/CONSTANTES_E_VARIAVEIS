import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Área da base (Ab) e área lateral (Al)
        System.out.print("Digite a área da base da pirâmide (Ab): ");
        double areaBase = scanner.nextDouble();

        System.out.print("Digite a área lateral da pirâmide (Al): ");
        double areaLateral = scanner.nextDouble();

        double areaTotal = areaBase + areaLateral;

        System.out.println("A área total da pirâmide é: " + areaTotal);

        scanner.close();
    }
}