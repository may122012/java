package monitoria;

import java.util.Scanner;

public class ArrayInversa {
    
    /*
     * Crie um programa que leia 5 números inteiros e armazene-os em um array. Em seguida,
     *   imprima os números na ordem inversa.
     */
    public static void main(String[] args) {
        int[] lista = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números: ");
        
        for(int i = 0; i < lista.length; i++){
            lista[i] = input.nextInt();
            input.nextLine();
        }

        for(int i = 0; i < lista.length; i++){
            System.out.println("Elmento na posição " + (i+1) + ": " + lista[i]);
        }

        System.out.println("Ordem inversa: ");
        for(int i = lista.length-1; i >= 0 ; i--) {
            System.out.println("Elemento na posição " + (i+1) + ": " + lista[i]);
        }

    }
   
}
