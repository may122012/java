package monitoria;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        // 25 graus
        // 25 graus equivale a 77 F
        // graus célsius para F
        // F = (C * 9/5) + 32
        Scanner input = new Scanner(System.in);

        double celsius;
        double fah;


        // 32.123
        // 10000.0001011010101010

        System.out.println("Digite a temperatura em celsius: ");
        // Pegar string => double;
        // nextDouble
        celsius = input.nextDouble();

        fah = (celsius * 9/5) + 32;


        System.out.println("Celsius: " + celsius);
        System.out.println("Fah: " + fah);


    }   
    
    static double celsiusParaFah(double celsius){
        return (celsius * 9/5) + 32;
    }
}
