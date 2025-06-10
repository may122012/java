import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Capital inicial: ");
        double capital = scanner.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = scanner.nextDouble() / 100;
        System.out.print("Tempo (meses): ");
        int tempo = scanner.nextInt();
        
        double montante = capital * Math.pow(1 + taxa, tempo);
        System.out.printf("Montante após %d meses: R$ %.2f%n", tempo, montante);
    }
}