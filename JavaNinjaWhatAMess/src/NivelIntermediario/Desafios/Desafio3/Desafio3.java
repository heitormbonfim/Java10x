package NivelIntermediario.Desafios.Desafio3;

import NivelIntermediario.Desafios.Desafio3.Modules.ContaCorrente;

public class Desafio3 {
    public static void main(String[] args) {
        ContaCorrente contaDoHeitor = new ContaCorrente(1000);
        double valorAntesDoDeposito = contaDoHeitor.consultarSaldo();
        System.out.println("Valor antes do depósito: " + valorAntesDoDeposito);
        contaDoHeitor.depositar(100);
        System.out.println("--------------- x x x ---------------");
        double valorDepoisDoDeposito = contaDoHeitor.consultarSaldo();
        System.out.println("Valor depois do depósito: " + valorDepoisDoDeposito);
    }
}
