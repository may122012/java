import java.util.Scanner;

public record Ponto(double x, double y) {}

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as coordenadas do primeiro ponto:");
        Ponto p1 = new Ponto(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Digite as coordenadas do segundo ponto:");
        Ponto p2 = new Ponto(scanner.nextDouble(), scanner.nextDouble());
        
        double distancia = Math.sqrt(Math.pow(p2.x() - p1.x(), 2) + Math.pow(p2.y() - p1.y(), 2));
        System.out.printf("A distância entre os pontos (%.2f, %.2f) e (%.2f, %.2f) é: %.2f%n",
                         p1.x(), p1.y(), p2.x(), p2.y(), distancia);
    }
}
