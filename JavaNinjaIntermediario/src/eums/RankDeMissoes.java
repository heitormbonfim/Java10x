package eums;

// complex version
public enum RankDeMissoes {
  S("Mestre", 5),
  A("Profissional", 4),
  B("Alto", 3),
  C("Moderado", 2),
  D("Baixo", 1);

  private String descricao;
  private int dificuldade;

  RankDeMissoes(String descricao, int dificuldade) {
    this.descricao = descricao;
    this.dificuldade = dificuldade;
  }

  public String getDescricao() {
    return descricao;
  }

  public int getDificuldade() {
    return dificuldade;
  }

}

// simplified version
// public enum RankDeMissoes {
// S,
// A,
// B,
// C,
// D,
// }
