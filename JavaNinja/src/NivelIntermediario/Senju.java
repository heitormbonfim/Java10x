package NivelIntermediario;

public class Senju extends Hokages {
    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    public Senju() {
    }



    @Override
    public void sabedoriaHokage() {
        System.out.println("Você adquiriu a sabedoreia Hokage");
    }
}
