package modules;

import eums.Bijus;

public class Uzumaki extends Ninja {
  Bijus bijus;

  public Uzumaki() {
    super();
  }

  public Uzumaki(String name, String aldeia, int idade, int numeroDeMissoesConcluidas) {
    super(name, aldeia, idade, numeroDeMissoesConcluidas);
  }

  public Uzumaki(String name, String aldeia, int idade, int numeroDeMissoesConcluidas, Bijus biju) {
    super(name, aldeia, idade, numeroDeMissoesConcluidas);
    this.bijus = biju;
  }

  @Override
  public String toString() {
    return "Uzumaki [bijus=" + bijus + ", getNome()=" + getNome() + ", getAldeia()=" + getAldeia()
        + ", getIdade()="
        + getIdade() + ", getNumeroDeMissoesConcluidas()=" + getNumeroDeMissoesConcluidas() + ", getAltura()="
        + getAltura() + "]";
  }

}
