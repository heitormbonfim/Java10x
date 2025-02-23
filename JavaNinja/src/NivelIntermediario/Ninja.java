package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    String habilidadeEspecial;
    String estrategiaDeBatalha;
    NivelNinja rank;

    // TODO: adicionar 2 novos atributos: número de missões e patente do ninja

    public Ninja() {}

    public Ninja(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidadeEspecial = habilidadeEspecial;
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

    // SOBRECARGA DO CONSTRUTOR
    // SOBRECARGA SERVE PARA NÃO QUEBRAR O CÓDIGO QUE FEZ AS CHAMADAS DOS CONSTRUCTOR ACIMA
    public Ninja(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha, NivelNinja rank) {
        this(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha); // referencia novamente os anteriores acima em vez de repassar como this.nome = nome, etc
        this.rank = rank;
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
