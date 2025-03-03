package modules;

public abstract class Ninja {
  private String nome;
  private String aldeia;
  private int idade;
  private int numeroDeMissoesConcluidas;
  private final double altura = 2.10;

  public Ninja() {

  }

  public Ninja(String name, String aldeia, int idade, int numeroDeMissoesConcluidas) {
    this.nome = name;
    this.aldeia = aldeia;
    this.idade = idade;
    this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String name) {
    this.nome = name;
  }

  public String getAldeia() {
    return aldeia;
  }

  public void setAldeia(String aldeia) {
    this.aldeia = aldeia;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getNumeroDeMissoesConcluidas() {
    return numeroDeMissoesConcluidas;
  }

  public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
    this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
  }

  public double getAltura() {
    return altura;
  }

  @Override
  public String toString() {
    return "Ninja [name=" + nome + ", aldeia=" + aldeia + ", idade=" + idade + ", numeroDeMissoesConcluidas="
        + numeroDeMissoesConcluidas + ", altura=" + altura + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((aldeia == null) ? 0 : aldeia.hashCode());
    result = prime * result + idade;
    result = prime * result + numeroDeMissoesConcluidas;
    long temp;
    temp = Double.doubleToLongBits(altura);
    result = prime * result + (int) (temp ^ (temp >>> 32));
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
    Ninja other = (Ninja) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (aldeia == null) {
      if (other.aldeia != null)
        return false;
    } else if (!aldeia.equals(other.aldeia))
      return false;
    if (idade != other.idade)
      return false;
    if (numeroDeMissoesConcluidas != other.numeroDeMissoesConcluidas)
      return false;
    if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
      return false;
    return true;
  }

}
