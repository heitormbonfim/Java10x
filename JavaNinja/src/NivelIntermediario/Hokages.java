package NivelIntermediario;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // Geralmente também é colocado quando iniciazamos classes com construtores
    public Hokages() {

    }

    public abstract void sabedoriaHokage();
}
