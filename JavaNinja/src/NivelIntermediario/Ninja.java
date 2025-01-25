package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    private int anosParaSeTornarUmHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public void quandoSeTornaraHokage(int idade) {
        int idadeMinima = this.anosParaSeTornarUmHokage(idade);
        System.out.println("Falta " + idadeMinima + " para " + this.nome + " poder se tornar Hokage");
    }
}
