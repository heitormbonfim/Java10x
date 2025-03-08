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
  }
}
