package desafios.desafio6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Desafio6 {
  public static void main(String[] args) {
    // Iniciar uma linked list com 7 ninjas
    Scanner sc = new Scanner(System.in);
    LinkedList<Ninja> ninjas = new LinkedList<Ninja>();
    ninjas.add(new Ninja("Naruto", 16, "Folha"));
    ninjas.add(new Ninja("Sasuke", 16, "Folha"));
    ninjas.add(new Ninja("Sakura", 16, "Folha"));
    ninjas.add(new Ninja("Zabuza", 16, "Névoa"));
    ninjas.add(new Ninja("Gaara", 16, "Areia"));
    ninjas.add(new Ninja("Killer Bee", 16, "Pedra"));
    ninjas.add(new Ninja("Pain", 16, "Chuva"));

    Boolean addingNinja = true;

    while (addingNinja) {
      System.out.println("\n\n#### Gerenciador de Ninjas ####\n\n");
      System.out.println("Opções:");
      System.out.println("1. Adicionar Ninja");
      System.out.println("2. Remover Ninja");
      System.out.println("3. Procurar Ninja");
      System.out.println("4. Listar Ninjas");
      System.out.println("5. Sair");

      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case 1:
          // Adicionar o ninja no início da lista
          System.out.print("Nome: ");
          String nome = sc.nextLine();
          System.out.print("Idade: ");
          int idade = sc.nextInt();
          sc.nextLine();
          System.out.print("Vila: ");
          String vila = sc.nextLine();
          Ninja newNinja = new Ninja(nome, idade, vila);
          ninjas.addFirst(newNinja);
          System.out.println("Ninja adicionado");
          break;
        case 2:
          // Remover um ninja do início da lista
          ninjas.remove();
          System.out.println("Ninja removido");
          break;
        case 3:
          // Procurar um ninja por índice
          System.out.println("\n\n### Buscar Ninja ####\n\n");
          System.out.print("Escreva o nome do ninja: ");
          String ninjaName = sc.nextLine().trim();
          Boolean found = false;

          Ninja[] cloneNinjas = new Ninja[ninjas.size()];
          cloneNinjas = ninjas.toArray(cloneNinjas);

          for (int i = 0; i < ninjas.size(); i++) {
            if (cloneNinjas[i].getNome().toLowerCase().equals(ninjaName)) {
              System.out.println("\n\n ===>>> Ninja Econtrado: " + cloneNinjas[i].getNome());
              found = true;
            }
          }

          if (!found) {
            System.out.println("\n\n XXXX Ninja não encontrado");
          }

          break;
        case 4:
          System.out.println("\n\n #### Listando Ninjas ####\n\n");
          for (Ninja ninja : ninjas) {
            System.out.println(" - " + ninja.getNome());
          }
          break;
        case 5:
          System.out.println("Saindo...");
          addingNinja = false;
          break;
        default:
          System.out.println("Opção inválida");
      }
    }

    sc.close();
  }
}
