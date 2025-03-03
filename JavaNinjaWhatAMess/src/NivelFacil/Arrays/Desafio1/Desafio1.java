package NivelFacil.Arrays.Desafio1;

public class Desafio1 {
    public static void main(String[] args) {
        Ninjas ninja1 = new Ninjas("Naruto", 14, "Capturar o 3 Hokage", 'A', false);
        Ninjas ninja2 = new Ninjas("Sasuke", 15, "Matar um porco", 'D', false);
        Ninjas ninja3 = new Ninjas("Kakashi", 27, "Matar um invasor", 'B', false);
        System.out.println(ninja1.showNinjaData());
        System.out.println(ninja2.showNinjaData());
        System.out.println(ninja3.showNinjaData());
    }
}