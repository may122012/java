package monitoria;

public class Fibonacci {
    /*
     * {1, 1}
     * {1, 1, (1 + 1) = 2, (1 + 2) = 3, (2 + 3) = 5, (3 + 5) = 8}
     */

    
    public static void main(String[] args) {
        int tamanhoSequencia = 10;
        int[] sequenciaFibonnaci = new int[tamanhoSequencia];
    
        for (int i = 0; i < sequenciaFibonnaci.length; i++){
            if (i == 0 || i == 1){
                sequenciaFibonnaci[i] = 1;
                continue;
            }

            sequenciaFibonnaci[i] = sequenciaFibonnaci[i-1] + sequenciaFibonnaci[i-2]; // 2
        }

        for (int i = 0; i < sequenciaFibonnaci.length; i++){
            System.out.println("Elemento na posição " + (i+1) + ": " + sequenciaFibonnaci[i]);
        }
    }

}
