package modules;

import interfaces.Sharingan;

public class Uchiha extends Ninja implements Sharingan {
  public Uchiha() {
    super();
  }

  public Uchiha(String name, String aldeia, int idade, int numeroDeMissoesConcluidas) {
    super(name, aldeia, idade, numeroDeMissoesConcluidas);
  }

  // Método implementado pela intercace Sharingan
  @Override
  public void ativarSharingan() {

    System.out.println("Meu nome é " + this.getNome() + " e eu ativei meu Sharingan");
  }
}
