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

    @Override // Override é mais usado por conta de conversão e evitar erros de digitação
    public void sharinganAtivado() {
        System.out.println("Meu nome é " + nome + " e meu sharingan ativou");
    }

    @Override
    public void estrategiaDeBatalha() {
        this.estrategiaDeBatalha = "Jutsu bola de fogo";
        System.out.println(estrategiaDeBatalha);
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é "+ this.nome + " e eu tenho inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        System.out.println("Meu nome é "+ this.nome + " e essa é minha inteligencia de combate " + qi);
    }

    private Uchiha(Builder builder) {
        this.nome = builder.nome;
        this.idade = builder.idade;
        this.aldeia = builder.aldeia;
    }
    
    
    public static class Builder {
        private String nome;
        private int idade;
        private String aldeia;
        
        public Builder nome(String name) {
            this.nome = name;
            return this;
        }
        
        public Builder idade(int age) {
            this.idade = age;
            return this;
        }
        
        public Builder aldeia(String village) {
            this.aldeia = village;
            return this;
        }
        
        public Uchiha build() {
            return new Uchiha(this);
        }
    }
}
