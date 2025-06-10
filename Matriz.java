import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3: ");
        for (int i = 0; i < 3;i++){
        for (int j = 0; j < 3; j++){
            System.out.print("Posição ["+ i +"]["+ j +"]: ");
        matriz[i][j] = scanner.nextInt();

         }
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 3;i++){
            int somaLinha = 0;
            for (int j = 0; j < 3; j++){
                somaLinha += matriz[i][j];
            }
        
        System.out.println("Linha" + i +":" + somaLinha);
        }

         System.out.println("\nSoma de cada coluna:");
        for (int i = 0; i < 3;i++){
            int somaColuna = 0;
            for (int j = 0; j < 3; j++){
                somaColuna  += matriz[i][j];
            }
        
        System.out.println("coluna" + i +":" + somaColuna );
        }

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++){
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][2-i];
        }

        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma diagonal secundária:" + somaDiagonalSecundaria);

        scanner.close();
    }
}
