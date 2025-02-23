package NivelIntermediario;

public class Uchiha extends Ninja implements Sharingan {

    public Uchiha() {
        super(); // Pega o construtor da Superclasse (Ninja)
    }

    public Uchiha(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha) {
        // Pega o construtor da Superclasse (Ninja)
        // mas passando todos os valores dentro do super
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha);
    }

    public Uchiha(String nome, String aldeia, int idade, String habilidadeEspecial, String estrategiaDeBatalha, NivelNinja rank) {
        super(nome, aldeia, idade, habilidadeEspecial, estrategiaDeBatalha, rank);
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é " + nome + " e meu sharingan ativou");
    }

    @Override
    public void estrategiaDeBatalha() {
        this.estrategiaDeBatalha = "Jutsu bola de fogo";
        System.out.println(estrategiaDeBatalha);
    }
}
