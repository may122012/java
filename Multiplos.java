package monitoria;

public class Multiplos {
    /* 5
     * Escreva um programa que imprima os números de 1 a N, substituindo múltiplos de 3 por
    "Fizz", múltiplos de 5 por "Buzz" e múltiplos de ambos por "FizzBuzz".
     */

    public static void main(String[] args) {
        int numeroMaximo = 100;
        for (int i = 1; i <= numeroMaximo; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println("Número: " + i);
            }
        }
    }
}
