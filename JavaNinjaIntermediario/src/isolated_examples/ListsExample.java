package isolated_examples;

import java.util.ArrayList;
import java.util.List;

public class ListsExample {
  public static void main(String[] args) {
    List<String> ninjasList = new ArrayList<>();
    ninjasList.add("Naruto");
    ninjasList.add("Sasuke");
    ninjasList.add("Kakashi");
    ninjasList.add("Sakura");
    System.out.println("----------------------------");
    System.out.println(ninjasList);
    System.out.println("---------------- After removing item ------------------");
    ninjasList.remove(1);
    ninjasList.remove("Sakura");

    for (int i = 0; i < ninjasList.size(); i++) {
      System.out.println(ninjasList.get(i));
    }

    System.out.println("--------------- changing element ----------------");
    for (int i = 0; i < ninjasList.size(); i++) {
      if (ninjasList.get(i) == "Naruto") {
        ninjasList.set(i, "Minato"); // changing element
      }
    }

    System.out.println(ninjasList);
  }
}
