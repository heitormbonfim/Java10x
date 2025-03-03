package NivelFacil.Arrays;

import java.util.Arrays;

public class Aula1Array {
    public static void main(String[] args) {
        String[] ninjas = new String[3]; // Reservando espaço na memória
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";

        System.out.println(Arrays.toString(ninjas));

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

        int[] idade = new int[2]; // repare no new int. Isso significa que o array é um objeto de memória

        idade[0] = 16;
        idade[1] = 17;

        System.out.println(Arrays.toString(idade));
    }
}
