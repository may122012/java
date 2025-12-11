package model;

import java.util.Scanner; // Import necessário para o método lerDados

public class Desktop extends Computador { // <--- DECLARAÇÃO DA CLASSE CORRETA
 
    private int qtdMemoriaGB; // atributo específico do Desktop (GB)
    private String gabinete;  // atributo específico

    public Desktop(int id, String marca, String modelo, double preco, int qtdMemoriaGB, String gabinete) {
        super(id, marca, modelo, preco);
        this.qtdMemoriaGB = qtdMemoriaGB;
        this.gabinete = gabinete;
    }

    public int getQtdMemoriaGB() {
        return qtdMemoriaGB;
    }

    public void setQtdMemoriaGB(int qtdMemoriaGB) {
        this.qtdMemoriaGB = qtdMemoriaGB;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Desktop" + " | Memória (GB): " + qtdMemoriaGB + " | Gabinete: " + gabinete;
    }

    // lerDados static conforme enunciado
    public static Desktop lerDados(Scanner sc) {
        try {
            System.out.print("Id: ");
            int id = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Marca: ");
            String marca = sc.nextLine().trim();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine().trim();

            System.out.print("Preco (ex: 1500.50): ");
            double preco = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Quantidade de memória (GB): ");
            int memoria = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Gabinete: ");
            String gabinete = sc.nextLine().trim();

            return new Desktop(id, marca, modelo, preco, memoria, gabinete);
        } catch (Exception e) {
            System.out.println("Erro ao ler dados do Desktop: " + e.getMessage());
            return null;
        }
    }
}