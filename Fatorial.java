package monitoria;

public class Fatorial {
    /*
     * 5! = 5 * 4 * 3 * 2 * 1 = 120
     * 
     */

    public static void main(String[] args) {
        int numero = 5;
        int resultadoFatorial;

        resultadoFatorial = fatorial(5);

        System.out.println(resultadoFatorial);
    }

    static int fatorial(int numero){
        // 1 * 2 * 3 * 4 * 5
    
        int total = 1;

        for(int i = 1; i <= numero; i++){
            total = total * i; // 1 * 1  | 1 * 2 | 2 * 3 | 6 * 4 | 24 * 5
        }

        return total;
    }
}
