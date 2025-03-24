package isolated_examples.psvm;

public class Ninja {
  String name;

  // static method não precisa ser criado uma nova classe para ser chamado fora

  public static void metodoEstatico() {
    System.out.println("Sou um método estático da classe Ninja");
  }

  // method não estático precisa ser instanciado uma nova classe

  public void metodoNaoEstatico() {
    System.out.println("Sou um método não-estático da classe Ninja");
  }
}
