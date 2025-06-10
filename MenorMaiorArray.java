package monitoria;

public class MenorMaiorArray {
    /*
     * Escreva um programa que encontre o maior e o menor valor em um array, bem como suas
        posições.
     */

     public static void main(String[] args) {
        int[] listaNumeros = {8, -4, 10, 20, 1, -5, 7};
        int posicaoMenorNumero = 0;
        int posicaoMaiorNumero = 0;
        for(int i = 0; i < listaNumeros.length; i++){
            if (listaNumeros[posicaoMaiorNumero] < listaNumeros[i]){
                posicaoMaiorNumero = i;
            }
            if (listaNumeros[posicaoMenorNumero] > listaNumeros[i]){
                posicaoMenorNumero = i;
            }
        }

        System.out.println("Posição do maior: " + posicaoMaiorNumero + " Valor: " + listaNumeros[posicaoMaiorNumero]);
        System.out.println("Posição do menor: " + posicaoMenorNumero + " Valor: " + listaNumeros[posicaoMenorNumero]);
     }
 
}
