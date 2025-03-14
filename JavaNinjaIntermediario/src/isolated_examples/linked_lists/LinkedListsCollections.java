package isolated_examples.linked_lists;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListsCollections {
  public static void main(String[] args) {
    LinkedList<String> ninjas = new LinkedList<>();
    ninjas.add("Naruto");
    ninjas.add("Sasuke");
    ninjas.add("Sakura");
    System.out.println(ninjas);
    System.out.println("---- adicionando kakashi de forma mais eficiente ----");
    ninjas.add(1, "Kakashi");
    System.out.println(ninjas);
    System.out.println("---- removendo o sasuke de forma mais eficiente ----");
    ninjas.remove(2);
    System.out.println(ninjas);

    // collections são basicamente interfaces sendo usadas nas estrutura de dados
    System.out.println("---- COLLECTIONS ----");
    System.out.println("Queue is an interface that extends Collection");
    Queue<String> queue = new LinkedList();
    System.out.println("Priority Queue is a class that implements Queue");
    PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
  }
}
