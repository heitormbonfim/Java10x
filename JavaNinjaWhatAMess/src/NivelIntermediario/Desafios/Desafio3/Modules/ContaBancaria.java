package NivelIntermediario.Desafios.Desafio3.Modules;

import NivelIntermediario.Desafios.Desafio3.Interfaces.Conta;

public abstract class ContaBancaria implements Conta {
  private double saldo;

  public ContaBancaria() {}

  public ContaBancaria(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public double consultarSaldo() {
    return this.saldo;
  }

  public double depositar(double valor) {
    double newValor = valor - (valor * 0.01);
    this.saldo += newValor;
    return this.saldo;
  }
}
