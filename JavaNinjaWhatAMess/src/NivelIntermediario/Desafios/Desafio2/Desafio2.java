package NivelIntermediario.Desafios.Desafio2;

public class Desafio2 {
    public static void main(String[] args) {
        NinjaBasico Shiku = new NinjaBasico();
        Shiku.nome = "Shiku Kuzim Ho";
        Shiku.especialidade = TipoHabilidade.TAIJUTSU;
        Shiku.mostrarInformacoes();
        Shiku.executarHabilidade();

        System.out.println("----------------");

        NinjaAvancado Naruto = new NinjaAvancado("Naruto", 16, "Folha", TipoHabilidade.KATON);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
    }
}
