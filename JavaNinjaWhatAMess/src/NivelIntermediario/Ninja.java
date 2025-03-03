package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    String habilidadeEspecial;
    String estrategiaDeBatalha;
    NivelNinja rank;
    // Final evita que o atributo não seja sobrescrito
    final String vaiMorrer = "Eu vou morrer";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstrategiaDeBatalha() {
        return estrategiaDeBatalha;
    }

    public void setEstrategiaDeBatalha(String estrategiaDeBatalha) {
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    public String getVaiMorrer() {
        return this.vaiMorrer;
    }

    // Não vai funcionar porque é um atributo final
    // public void setVaiMorrer(String vaiMorrer) {
    // this.vaiMorrer = vaiMorrer;
    // }

    // TODO: adicionar 2 novos atributos: número de missões e patente do ninja

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidadeEspecial = habilidadeEspecial;
        this.estrategiaDeBatalha = estrategiaDeBatalha;
    }

    // SOBRECARGA DO CONSTRUTOR
    // SOBRECARGA SERVE PARA NÃO QUEBRAR O CÓDIGO QUE FEZ AS CHAMADAS DOS
    // CONSTRUCTOR ACIMA
    public Ninja(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha,
            NivelNinja rank) {
        this(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha); // referencia novamente os anteriores acima
                                                                            // em vez de repassar como this.nome = nome,
                                                                            // etc
        this.rank = rank;
    }

    // FINAL evita que outras classes Override este método
    final void tacarKunai() {
        System.out.println("EU SOU UM MÉTODO DA CLASSE MÃE");
    }

    private int anosParaSeTornarUmHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public void quandoSeTornaraHokage(int idade) {
        int idadeMinima = this.anosParaSeTornarUmHokage(idade);
        System.out.println("Falta " + idadeMinima + " para " + this.nome + " poder se tornar Hokage");
    }

    public void habilidadeEspecial() {
        System.out
                .println("Meu nome é " + this.nome + " e essa é minha habilidade especial: " + this.habilidadeEspecial);
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estratégia de batalha: " + estrategiaDeBatalha);
    }

    // Sobrecarga de metodos
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + this.nome + " e eu tenho inteligencia de combate");
    }

    public void inteligenciaDeCombate(int qi) {
        System.out.println("Meu nome é " + this.nome + " e essa é minha inteligencia de combate " + qi);
    }

    @Override
    public String toString() {
        return "Esse é o método toString para Referencia de memória, e meu nome é " +
                this.nome +
                " e eu vivo na " +
                this.aldeia +
                " e essa é minha referência de memória: " +
                super.toString();
    }
}
