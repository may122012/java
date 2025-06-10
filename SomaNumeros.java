import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();
        int soma = 0, i = 1;
        
        while (i <= n) {
            soma += i;
            i++;
        }
        System.out.printf("A soma dos números de 1 a %d é: %d%n", n, soma);
    }
}
