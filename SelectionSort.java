package monitoria;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listaNumeros = {8, -4, 10, 20, 1, -5, 7};
        // {-5, -4, 1, 7, 8, 10, 20}
        //1. Encontre o menor elemento no array não ordenado
        // 2. Troque-o com o primeiro elemento não ordenado
        // troca a posição do menor número com a posição 0
        // 3. Repita até que todo o array esteja ordenado

        // -5, -4, 10, 20, 1, 8, 7
        // xxxx, -4, 10, 20, 1, 8, 7
        // xxxx, xxxx, 1, 20, 10, 8, 7
        // xxx, xxx, xxx, 7, 10, 8, 20
        // xxx, xxx, xxx, xxx, 8, 10, 20
        // xxx, xxx, xxx, xxx, xxx, 10, 20
        // -5, -4, 1, 7, 8, 10, 20
        imprimirArray(listaNumeros);


        // listaNumeros => {...} // 0x3abc

        // array => listaNumero => {...} // 0x3abc

        for (int i = 0; i < listaNumeros.length; i++){
            int posicaoMenorNumero = encontrarPosicaoMenorNumero(i, listaNumeros);
            trocarPosicaoArray(i, posicaoMenorNumero, listaNumeros);
            
            System.out.println("============= PASSO " + i + "=============");           
            imprimirArray(listaNumeros);
        }
        

        System.out.println("======= NUMEROS ORDENADOS ======");
        imprimirArray(listaNumeros);
    }

    public static void imprimirArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Posição " + (i+1) + ": " + array[i]);
        }
    }

    static void trocarPosicaoArray(int posicao1, int posicao2, int[] array){
        int temporaria = array[posicao1];
        array[posicao1] = array[posicao2];
        array[posicao2] = temporaria;
    }

    static int encontrarPosicaoMenorNumero(int indiceInicial, int[] array){
        int posicaoMenorNumero = indiceInicial;
        for(int i = indiceInicial; i < array.length; i++){
            if(array[posicaoMenorNumero] > array[i]){
                posicaoMenorNumero = i;
            }
        }
        return posicaoMenorNumero;
    }
}
