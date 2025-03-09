package isolated_examples.generics;

public class Generics {
  public static void main(String[] args) {
    EquipamentoNinja kunai = new EquipamentoNinja("Kunai");
    EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
    EquipamentoNinja pergaminho = new EquipamentoNinja("Pergaminho");

    BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();

    bolsaGenerica.colocarEquipamentosGenericos(kunai);
    bolsaGenerica.colocarEquipamentosGenericos(shuriken);
    bolsaGenerica.colocarEquipamentosGenericos(pergaminho);

    System.out.println(bolsaGenerica);

    System.out.println("------------------------");
    BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
    bolsaNinja.adicionarFerramenta(new EquipamentoNinja("Kunai"));
    bolsaNinja.adicionarFerramenta(shuriken);
    bolsaNinja.adicionarFerramenta(pergaminho);
    bolsaNinja.mostrarFerramentas();
  }
}
