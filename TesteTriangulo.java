// Exercício 15: Triângulo com Record
import java.util.Scanner;

public record Triangulo(double a, double b, double c) {
    public String tipo() {
        if (a == b && b == c) return "Equilátero";
        if (a == b || a == c || b == c) return "Isósceles";
        return "Escaleno";
    }
    
    public double perimetro() {
        return a + b + c;
    }
    
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class TesteTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo:");
        Triangulo t = new Triangulo(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        
        System.out.println("Triângulo:");
        System.out.printf("Lados: %.1f, %.1f, %.1f%n", t.a(), t.b(), t.c());
        System.out.println("Tipo: " + t.tipo());
        System.out.printf("Perimetro: %.1f%n", t.perimetro());
        System.out.printf("Área: %.1f%n", t.area());
    }
}