package model;

//Notebook.java
import java.util.Scanner;

public class Notebook extends Computador {
 private int autonomiaBateriaHoras; // atributo específico do Notebook

 public Notebook(int id, String marca, String modelo, double preco, int autonomiaBateriaHoras) {
     super(id, marca, modelo, preco);
     this.autonomiaBateriaHoras = autonomiaBateriaHoras;
 }

 public int getAutonomiaBateriaHoras() {
     return autonomiaBateriaHoras;
 }

 public void setAutonomiaBateriaHoras(int autonomiaBateriaHoras) {
     this.autonomiaBateriaHoras = autonomiaBateriaHoras;
 }

 // toString usando super + info da subclasse
 @Override
 public String toString() {
     return super.toString() + " | Tipo: Notebook" + " | Autonomia (h): " + autonomiaBateriaHoras;
 }

 // método static lerDados (conforme enunciado)
 public static Notebook lerDados(Scanner sc) {
     try {
         System.out.print("Id: ");
         int id = Integer.parseInt(sc.nextLine().trim());

         System.out.print("Marca: ");
         String marca = sc.nextLine().trim();

         System.out.print("Modelo: ");
         String modelo = sc.nextLine().trim();

         System.out.print("Preco (ex: 1500.50): ");
         double preco = Double.parseDouble(sc.nextLine().trim());

         System.out.print("Autonomia da bateria (horas): ");
         int autonomia = Integer.parseInt(sc.nextLine().trim());

         return new Notebook(id, marca, modelo, preco, autonomia);
     } catch (Exception e) {
         System.out.println("Erro ao ler dados do Notebook: " + e.getMessage());
         return null;
     }
 }
}

