package eums;

public enum Bijus {
  ICHIBI("Shukaku", 1),
  KYUBI("Kurama", 9),
  HACHIBI("Gyuuki", 8);

  String nome;
  int numeroDeCaldas;

  Bijus() {
  }

  Bijus(String nome, int numeroDeCaldas) {
    this.nome = nome;
    this.numeroDeCaldas = numeroDeCaldas;
  }

}
