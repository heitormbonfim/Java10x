package isolated_examples.records;

public class Records {
  public static void main(String[] args) {
    Ninja cadastro = new Ninja("Naruto", "naruto@email.anime", "88999978427");
    System.out.println(cadastro.nameUpperCased());
    System.out.println(cadastro);
  }
}
