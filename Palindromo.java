import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        boolean ehPalindromo = true;
        for (int i = 0; i < palavra.length()/2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length()-1-i)) {
                ehPalindromo = false;
                break;
            }
        }
        
        if (ehPalindromo) {
            System.out.printf("\"%s\" é um palindromo!%n", palavra);
        } else {
            System.out.printf("\"%s\" NÃO é um palindromo.%n", palavra);
        }
    }
}