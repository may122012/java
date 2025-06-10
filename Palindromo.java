package monitoria;

public class Palindromo {
    public static void main(String[] args) {
        /*
         * palavra: ABCBA
         * palavra2: SubiNoOnibuS
         * palavra3: Enzo
         */

        String palavra = "subi no onibus"; 

        boolean ehPalindromo = verificarPalindromo(palavra);

        if(ehPalindromo){
            System.out.println("A palavra " + palavra + " é um palindromo");
        } else {
            System.out.println("A palavra " + palavra + " não é um palindromo!");
        }
    }

    static boolean verificarPalindromo(String palavra){
        String palavraContrario = "";

        for(int i = palavra.length()-1; i >= 0 ;i-- ){
            char letra = palavra.charAt(i); // 'O', 'Z', 'N', 'E'
            palavraContrario += letra; // "O", "OZ", "OZN", "OZNE"...
        }

        System.out.println("Palavra ao contrário: " + palavraContrario);
        System.out.println("Palavra normal: " + palavra);
        if (palavraContrario.equals(palavra)){
            return true;
        } else {
            return false;
        }
    }
}
