import modules.Uchiha;
import modules.Uzumaki;

public class Main {
  public static void main(String[] args) {
    System.out.println("---------------- Uzumaki ----------------");
    Uzumaki naruto = new Uzumaki("Naruto", "Folha", 17, 20);
    System.out.println(naruto);
    naruto.setNome("Naruto Uzumaki");
    System.out.println("Nome: " + naruto.getNome());

    System.out.println("---------------- Uchiha -----------------");
    Uchiha sasuke = new Uchiha("Sasuke", "Folha", 18, 21);
    System.out.println(sasuke);
    sasuke.setNome("Sasuke Uchiha");
    System.out.println("Nome: " + sasuke.getNome());
  }
}
