package NivelIntermediario;

public class Hyuga extends Ninja {

    public Hyuga() {
    }

    public Hyuga(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha);
    }

    public Hyuga(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha, NivelNinja rank) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha, rank);
    }

    public void ativarByakugan() {
        System.out.println("Meu nome é " + nome + " e eu ativei meu Byakugan");
    }
}
