package NivelIntermediario.ReferenciaDeMemoria;

import NivelIntermediario.Uchiha;
import NivelIntermediario.Uzumaki;

public class Memoria {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("--------------- Naruto ----------------");
        Uzumaki Naruto = new Uzumaki();
        Naruto.setNome("Naruto");
        Naruto.setAldeia("Folha");
        // System.out.println(Naruto.getNome());
        System.out.println(Naruto); // vai printar o toString automaticamente


        System.out.println("--------------- Sasuke ----------------");
        Uchiha Sasuke = new Uchiha.Builder()
        .nome("Sasuke")
        .aldeia("Folha")
        .idade(16)
        .build();
        System.out.println(Sasuke);
    }
}
