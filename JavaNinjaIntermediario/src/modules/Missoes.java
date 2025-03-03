package modules;

import eums.RankDeMissoes;

public class Missoes {
  private String nome;
  private RankDeMissoes rank;

  public Missoes() {
  }

  public Missoes(String nome, RankDeMissoes rank) {
    this.nome = nome;
    this.rank = rank;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public RankDeMissoes getRank() {
    return rank;
  }

  public void setRank(RankDeMissoes rank) {
    this.rank = rank;
  }

  public void exibirDetalhes() {
    System.out
        .println(
            "Missão " + this.nome + " - Rank " + rank.getDescricao() + " - Dificuldade " + rank.getDificuldade());
  }

  @Override
  public String toString() {
    return "Missoes [nome=" + nome + ", rank=" + rank + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((rank == null) ? 0 : rank.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Missoes other = (Missoes) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (rank != other.rank)
      return false;
    return true;
  }

}
