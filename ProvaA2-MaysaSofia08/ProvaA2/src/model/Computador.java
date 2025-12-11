package model;

//Computador.java
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Computador {
 protected int id;
 protected String marca;
 protected String modelo;
 protected double preco;

 // atributo estático compartilhado conforme enunciado
 public static List<Computador> listaComputador = new ArrayList<>();

 public Computador(int id, String marca, String modelo, double preco) {
     this.id = id;
     this.marca = marca;
     this.modelo = modelo;
     this.preco = preco;
 }

 // getters e setters
 public int getId() { return id; }
 public void setId(int id) { this.id = id; }

 public String getMarca() { return marca; }
 public void setMarca(String marca) { this.marca = marca; }

 public String getModelo() { return modelo; }
 public void setModelo(String modelo) { this.modelo = modelo; }

 public double getPreco() { return preco; }
 public void setPreco(double preco) { this.preco = preco; }

 // toString com informações base (subclasses devem usar super.toString())
 @Override
 public String toString() {
     return "ID: " + id +
            " | Marca: " + marca +
            " | Modelo: " + modelo +
            " | Preço: R$" + String.format("%.2f", preco);
 }

 // equals compara por id (conforme exigido)
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Computador)) return false;
     Computador that = (Computador) o;
     return this.id == that.id;
 }

 @Override
 public int hashCode() {
     return Objects.hash(id);
 }
}
