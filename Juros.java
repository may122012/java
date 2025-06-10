package monitoria;

import java.util.Scanner;

public class Juros {
    /*
    Crie um programa que calcule juros compostos. O usuário deve informar o capital inicial, a
    taxa de juros mensal e o tempo em meses.
    Fórmula: M = C × (1 + i)^t Onde:
    ● M = montante final
    ● C = capital inicial
    ● i = taxa de juros (em decimal)
    ● t = tempo
 */   

    public static void main(String[] args) {
        int tempo;
        double capitalInicial;
        double taxaJuros;
        double montanteFinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tempo: ");
        tempo = input.nextInt(); 
        input.nextLine();   

        System.out.println("Digite o capital inicial: ");
        capitalInicial = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a taxa de juros: ");
        taxaJuros = input.nextDouble();
        taxaJuros = taxaJuros/100;
        input.nextLine();

        montanteFinal = calcularMontanteFinal(capitalInicial, taxaJuros, tempo);
        System.out.println("Montate final: " + montanteFinal);
    }

    static double calcularMontanteFinal(double c, double i, int t){
        return c * potencia(1+i, t);
    }

    static double potencia(double base, int expoente){
        double total = base; // 3
        for(int i = 1; i < expoente; i++){
            total = total * base;
        }
        return total;
        // expoente = 3
        // base = 3
        // 3
        // 3 * 3 * 3
    }
}
