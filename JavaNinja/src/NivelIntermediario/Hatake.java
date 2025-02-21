package NivelIntermediario;

public class Hatake extends Ninja implements Sharingan, AmbuInterface, HokageInterface  {

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
