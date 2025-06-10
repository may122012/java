import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int fatorial = 1;
        
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        System.out.printf("%d! = %d%n", n, fatorial);
    }
}