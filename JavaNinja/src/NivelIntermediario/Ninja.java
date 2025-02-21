package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    String habilidadeEspecial;
    String estrategiaDeBatalha;

    public Ninja() {}

    public Ninja(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidadeEspecial = habilidadeEspecial;
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

    private int anosParaSeTornarUmHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public void quandoSeTornaraHokage(int idade) {
        int idadeMinima = this.anosParaSeTornarUmHokage(idade);
        System.out.println("Falta " + idadeMinima + " para " + this.nome + " poder se tornar Hokage");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é "+ this.nome + " e essa é minha habilidade especial: " + this.habilidadeEspecial);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estratégia de batalha: " + estrategiaDeBatalha);
    }
}
