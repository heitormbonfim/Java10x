package isolated_examples.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
  private List<T> ferramentas;

  public BolsaNinja() {
    this.ferramentas = new ArrayList<>();
  }

  public void adicionarFerramenta(T ferramenta) {
    ferramentas.add(ferramenta);
  }

  public void mostrarFerramentas() {
    System.out.println("Suas ferramentas na Bolsa Ninja:\n");
    for (T ferramenta : ferramentas) {
      System.out.println(ferramenta);
    }
  }
}
