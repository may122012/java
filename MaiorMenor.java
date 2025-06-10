import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros[0], posMaior = 0;
        int menor = numeros[0], posMenor = 0;
        
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.printf("Maior valor: %d (posição %d)%n", maior, posMaior);
        System.out.printf("Menor valor: %d (posição %d)%n", menor, posMenor);
    }
}