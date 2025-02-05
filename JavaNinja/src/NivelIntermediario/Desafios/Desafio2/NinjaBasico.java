package NivelIntermediario.Desafios.Desafio2;

public class NinjaBasico implements Ninja{
    String nome;
    TipoHabilidade especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println(this.nome);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(especialidade);
    }
}
