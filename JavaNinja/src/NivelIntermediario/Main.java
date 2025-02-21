package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Senju Hashirama = new Senju("Hashirama", 30, false);
        System.out.println(Hashirama.nome);
        Hashirama.sabedoriaHokage();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Folha", 27, "Sharingan", "Amaterasu");
        System.out.println(Itachi.nome);
        Itachi.estrategiaDeBatalha();
        Itachi.sharinganAtivado();

        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi";
        Kakashi.idade = 32;
        Kakashi.aldeia = "Folha";
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.souUmHokage();

    }
}