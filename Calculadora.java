import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        switch (operacao) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num1 / num2; break;
            default: System.out.println("Operação inválida!"); return;
        }
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operacao, num2, resultado);
    }
    
}
