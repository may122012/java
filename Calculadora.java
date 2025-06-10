package monitoria;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        int numero1;
        int numero2;
        int opcao;
        while(continuar){
            System.out.println("Digite um número: ");
            numero1 = leitor.nextInt(); leitor.nextLine();

            System.out.println("Digite outro número: ");
            numero2 = leitor.nextInt(); leitor.nextLine();

            System.out.println("Digite 1 para adicionar, 2 para sub, 3 para mult, 4 para dividir, digite 5 para sair");
            opcao = leitor.nextInt(); leitor.nextLine();

            switch(opcao){
                case 1: 
                    System.out.println("Valor da soma: " + soma(numero1, numero2));
                    break;
                case 2:
                    System.out.println("Valor da subtração: " + subtrair(numero1, numero2));
                    break;
                case 3:
                    System.out.println("Valor da multiplicação" + multiplicar(numero1, numero2));
                    break;
                case 4:
                    System.out.println("Valor da divisão: " + dividir(numero1, numero2));
                    break;
                case 5: 
                    continuar = false;
                    break;
                default:
                    System.out.println("Digite uma opção certa! burro");
                    break;
            }
        }
    }

    static int soma(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        return num1 + num2;
    }

    static int subtrair(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        return num1 - num2;
    }

    static int multiplicar(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));

        return num1 * num2;
    }

    static int dividir(int num1, int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        return  num1/num2;
    }
}
