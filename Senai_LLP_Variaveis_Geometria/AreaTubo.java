import java.util.Scanner;

public class AreaTubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio externo (R): ");
        double R = sc.nextDouble();

        System.out.print("Raio interno (r): ");
        double r = sc.nextDouble();

        System.out.print("Altura (h): ");
        double h = sc.nextDouble();

        double areaLateral = 2 * Math.PI * (R + r) * h;
        double areaBases = 2 * Math.PI * (R * R - r * r);
        double areaTotal = areaLateral + areaBases;

        System.out.printf("Área superficial total do tubo: %.2f\n", areaTotal);

        sc.close();
    }
}