package isolated_examples.hash_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
  public static void main(String[] args) {
    System.out.println("---- Permitindo Repetição no Array ----");

    List<String> ninjas = new ArrayList<>();

    ninjas.add("Zabuza");
    ninjas.add("Naruto");
    ninjas.add("Sakura");
    ninjas.add("Naruto");
    ninjas.add("Sasuke");
    ninjas.add("Sakura");
    ninjas.add("Rock Lee");
    ninjas.add("Naruto");
    ninjas.add("Boruto");
    ninjas.add("Danzou");

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
    // TreeSet é usado quando queremos por em uma ordem sequencial lógica,
    // alfabética, númerica, etc
    Set<String> ninjasTreeSet = new TreeSet<>();
    Set<Integer> numbers = new TreeSet<>();

    numbers.add(5);
    numbers.add(5);
    numbers.add(3);
    numbers.add(9);
    numbers.add(2);

    ninjasTreeSet.addAll(ninjas);

    System.out.println("ninjasTreeSet = " + ninjasTreeSet);
    System.out.println("numbers = " + numbers);

    System.out.println("---- Usando LinkedHashSet ----");
    // O LinkedHashSet vai colocar os dados na ordem de implementação
    Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();

    ninjasLinkedHashSet.addAll(ninjas);

    System.out.println("ninjasLinkedHashSet = " + ninjasLinkedHashSet);
  }
}