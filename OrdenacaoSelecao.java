// Exercício 11: Ordenação por Seleção
import java.util.Scanner;

public class OrdenacaoSelecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        
        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[minIndex];
            numeros[minIndex] = temp;
        }
        
        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}