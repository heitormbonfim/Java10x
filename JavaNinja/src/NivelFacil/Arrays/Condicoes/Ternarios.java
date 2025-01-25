package NivelFacil.Arrays.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        // ternarios são feitos para reduzir o código em vez de usar if e else
        // variavel = (condição) ? verdadeiro : falso;
        short numeroDeMissoes = 11;

        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
