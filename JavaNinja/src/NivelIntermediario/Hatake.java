package NivelIntermediario;

public class Hatake extends Ninja implements Sharingan, AmbuInterface, HokageInterface  {
    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha);
    }

    public Hatake(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha, NivelNinja rank) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha, rank);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é " + this.nome + " e eu ativei meu sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Faço aparte da Anbu");
    }

    @Override
    public void souUmHokage() {
        System.out.println("Sou um hokage");
    }
}
