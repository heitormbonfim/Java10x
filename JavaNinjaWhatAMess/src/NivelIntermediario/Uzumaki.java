package NivelIntermediario;

public class Uzumaki extends Ninja {


    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha);
    }

    public Uzumaki(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha, NivelNinja rank) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha, rank);
    }

    public void modoSabioAtivado () {
        System.out.println("Meu nome é " + nome + " e meu modo sábio ativou");
    }

}
