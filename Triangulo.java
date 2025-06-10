import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores podem formar um triângulo.");
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero (todos os lados iguais)");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles (dois lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes)");
            }
        } else {
            System.out.println("Os valores NÃO podem formar um triângulo.");
        }
    }
}