package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Senju Hashirama = new Senju("Hashirama", 30, false);
        System.out.println(Hashirama.nome);
        Hashirama.sabedoriaHokage();

        System.out.println("===================================");

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Folha", 27, "Sharingan", "Amaterasu");
        System.out.println(Itachi.nome);
        Itachi.estrategiaDeBatalha();
        Itachi.sharinganAtivado();

        System.out.println("===================================");

        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi";
        Kakashi.idade = 32;
        Kakashi.aldeia = "Folha";
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.souUmHokage();

        System.out.println("===================================");

        Uchiha Madara = new Uchiha();
        Madara.nome = "Madara";
        Madara.idade = 150;
        Madara.habilidadeEspecial = "Rinnegan";
        Madara.rank= NivelNinja.HAGE;
        Madara.estrategiaDeBatalha = "Imortalidade";
        Madara.habilidadeEspecial();
        Madara.estrategiaDeBatalha();
        // Metodo comum
        Madara.inteligenciaDeCombate();
        // Metodo sobrecarregado
        Madara.inteligenciaDeCombate(150);

        System.out.println("===================================");



    }
}