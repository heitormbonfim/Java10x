package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Folha";
        Sasuke.sharingaAtivado();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 16;
        Naruto.aldeia = "Folha";
        Naruto.quandoSeTornaraHokage(70);
        Naruto.modoSabioAtivado();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Folha";
        Hinata.ativarByakugan();
    }
}