package isolated_examples.psvm;

public class PsvmClass {
  // public = accesso a qualquer parte do código
  // static = pode ser acessado sem criar um objeto
  // void = nãa retorna nada
  // main =

  String variavelGlobalNaoEstatico = "Eu sou uma variável global não estática";
  static String variavelGlobalEstatica = "Eu sou uma variável global estática";

  public static void main(String[] args) {
    Ninja ninja = new Ninja();
    ninja.name = "Naruto";

    // Não dá pra chamar a variável global diretamente assim. Porque campos
    // não-estáticos
    // não podem ser referenciados em campos estáticos.
    // Ela teria que ser "static String variableGlobal" para funcionar.
    System.out.println(variavelGlobalEstatica); // assim pode
    // System.out.println(variavelGlobalNaoEstatico); // assim não pode

    // Para chamar uma não estática global teria que ser assim:
    PsvmClass psvmClassInstancia = new PsvmClass();
    System.out.println(psvmClassInstancia.variavelGlobalNaoEstatico);

    // Ninja.metodoNaoEstatico // O não estático não pode ser chamado assim
    Ninja.metodoEstatico(); // não precisa ser declarado uma
    Ninja novoObjeto = new Ninja(); // precisa instanciar um novo objeto
    novoObjeto.metodoNaoEstatico(); // para chamar o método não estático
  }
}
