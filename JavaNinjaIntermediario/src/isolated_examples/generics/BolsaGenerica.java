package isolated_examples.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> { // pode ser qualquer cosia <QualquerCoisa> em vez de <T>
  private List<T> equipamentos;

  public BolsaGenerica() {
    this.equipamentos = new ArrayList<>(); // precisa iniciar o construtor assim para não ser null
  }

  public void colocarEquipamentosGenericos(T equipamento) {
    this.equipamentos.add(equipamento);
  }

  public List<T> getEquipamentos() {
    return equipamentos;
  }

  public void setEquipamentos(List<T> equipamentos) {
    this.equipamentos = equipamentos;
  }

  @Override
  public String toString() {
    return "BolsaGenerica [equipamentos=" + equipamentos + "]";
  }
}
