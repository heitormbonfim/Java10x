package isolated_examples.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetClass {
  public static void main(String[] args) {
    System.out.println("---- Permitindo Repetição no Array ----");

    List<String> ninjas = new ArrayList<>();

    ninjas.add("Naruto");
    ninjas.add("Sakura");
    ninjas.add("Naruto");
    ninjas.add("Sasuke");
    ninjas.add("Sakura");
    ninjas.add("Rock Lee");
    ninjas.add("Naruto");

    System.out.println("ninjas = " + ninjas);

    System.out.println("---- Não permitindo repetições no array ----");

    /*
     * Set / HashSet vai ser utilizado 99% das vezes que eu quiser ignorar
     * itens repetidos dentro da minha lista.
     * 
     * Set não trabalha com index
     * 
     * Não tem ordenação
     */

    Set<String> ninjasSet = new HashSet<>();

    // adicionando manualmente
    // ninjasSet.add("Naruto");
    // ninjasSet.add("Sakura");
    // ninjasSet.add("Naruto");

    // adicionando de outra list
    ninjasSet.addAll(ninjas);
    ninjasSet.remove("Sakura");

    System.out.println("ninjasSet = " + ninjasSet);

    System.out.println("---- TreeSet vs HashSet ----");
  }
}