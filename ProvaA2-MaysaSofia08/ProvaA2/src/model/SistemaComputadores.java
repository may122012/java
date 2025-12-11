package model;

//SistemaComputadores.java (classe com main e menu "infinito")
import java.util.*;
import java.util.stream.Collectors;

public class SistemaComputadores {
 private static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {
     boolean rodando = true;
     while (rodando) {
         try {
             exibirMenu();
             String opc = sc.nextLine().trim();
             switch (opc) {
                 case "1": inserirComputador(); break;
                 case "2": excluirComputador(); break;
                 case "3": listarTodos(); break;
                 case "4": listarNotebooks(); break;
                 case "5": listarDesktops(); break;
                 case "6":
                     System.out.println("Saindo..."); rodando = false; break;
                 default:
                     System.out.println("Opção inválida. Tente novamente.");
             }
         } catch (Exception e) {
             System.out.println("Erro no menu: " + e.getMessage());
         }
         System.out.println();
     }
 }

 private static void exibirMenu() {
     System.out.println("=== MENU ===");
     System.out.println("1. Inserir um Computador");
     System.out.println("2. Excluir um Computador");
     System.out.println("3. Listar Todos os Computadores");
     System.out.println("4. Listar os Notebooks");
     System.out.println("5. Listar os Desktops");
     System.out.println("6. Sair");
     System.out.print("Escolha: ");
 }

 // Inserir: pergunta qual tipo e usa lerDados estático das subclasses
 private static void inserirComputador() {
     try {
         System.out.println("Tipo a inserir: 1- Notebook | 2- Desktop");
         String tipo = sc.nextLine().trim();
         Computador novo = null;
         if ("1".equals(tipo)) {
             novo = Notebook.lerDados(sc);
         } else if ("2".equals(tipo)) {
             novo = Desktop.lerDados(sc);
         } else {
             System.out.println("Tipo inválido.");
             return;
         }

         if (novo != null) {
             // checar duplicidade de id usando equals (que compara id)
             boolean existe = Computador.listaComputador.stream().anyMatch(c -> c.equals(novo));
             if (existe) {
                 System.out.println("Já existe um computador com esse ID. Inserção cancelada.");
             } else {
                 Computador.listaComputador.add(novo);
                 System.out.println("Computador adicionado com sucesso!");
             }
         } else {
             System.out.println("Falha ao criar o computador (dados inválidos).");
         }
     } catch (Exception e) {
         System.out.println("Erro ao inserir: " + e.getMessage());
     }
 }

 // Excluir por id
 private static void excluirComputador() {
     try {
         System.out.print("Informe o ID a ser excluído: ");
         int id = Integer.parseInt(sc.nextLine().trim());
         Optional<Computador> opt = Computador.listaComputador.stream()
                 .filter(c -> c.getId() == id)
                 .findFirst();
         if (opt.isPresent()) {
             Computador.listaComputador.remove(opt.get());
             System.out.println("Computador com ID " + id + " removido.");
         } else {
             System.out.println("ID não encontrado.");
         }
     } catch (Exception e) {
         System.out.println("Erro ao excluir: " + e.getMessage());
     }
 }

 // Listar todos: ordenar por id antes
 private static void listarTodos() {
     try {
         List<Computador> copia = new ArrayList<>(Computador.listaComputador);
         copia.sort(Comparator.comparingInt(Computador::getId));
         if (copia.isEmpty()) {
             System.out.println("Lista vazia.");
             return;
         }
         for (int i = 0; i < copia.size(); i++) {
             Computador c = copia.get(i);
             System.out.println("Posição na lista: " + (i+1) + " -> " + c.toString());
         }
     } catch (Exception e) {
         System.out.println("Erro ao listar todos: " + e.getMessage());
     }
 }

 // Listar notebooks: filtrar e ordenar por autonomiaBateriaHoras
 private static void listarNotebooks() {
     try {
         List<Notebook> notebooks = Computador.listaComputador.stream()
                 .filter(c -> c instanceof Notebook)
                 .map(c -> (Notebook) c)
                 .sorted(Comparator.comparingInt(Notebook::getAutonomiaBateriaHoras).reversed()) // maiors -> menores
                 .collect(Collectors.toList());

         if (notebooks.isEmpty()) {
             System.out.println("Nenhum notebook cadastrado.");
             return;
         }

         for (int i = 0; i < notebooks.size(); i++) {
             Notebook n = notebooks.get(i);
             System.out.println("Posição na lista (filtrada): " + (i+1) + " -> " + n.toString());
         }
     } catch (Exception e) {
         System.out.println("Erro ao listar notebooks: " + e.getMessage());
     }
 }

 // Listar desktops: filtrar e ordenar por qtdMemoriaGB (ascendente)
 private static void listarDesktops() {
     try {
         List<Desktop> desktops = Computador.listaComputador.stream()
                 .filter(c -> c instanceof Desktop)
                 .map(c -> (Desktop) c)
                 .sorted(Comparator.comparingInt(Desktop::getQtdMemoriaGB))
                 .collect(Collectors.toList());

         if (desktops.isEmpty()) {
             System.out.println("Nenhum desktop cadastrado.");
             return;
         }

         for (int i = 0; i < desktops.size(); i++) {
             Desktop d = desktops.get(i);
             System.out.println("Posição na lista (filtrada): " + (i+1) + " -> " + d.toString());
         }
     } catch (Exception e) {
         System.out.println("Erro ao listar desktops: " + e.getMessage());
     }
 }
}
