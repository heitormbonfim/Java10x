package NivelFacil.Arrays.TiposDeDados;

public class DadosPrimitivos {
    // shortcut to generate the public static void main: psvm
    // tipos primitivos não têm métodos
    public static void main(String[] args) {
        int idade = 16; // Valor máximo do int é 2 bilhões
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L; // Valor máximo do Long é 9 quadrilhões

        // shortcut sout ou soutv para gerar os prints mais rápidos
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(inicial);
        System.out.println(vivoOuMorto);
        System.out.println(saldoBancario);
        System.out.println("saldoBancario = " + saldoBancario); // usando soutv

        // linux ctrl + F5 to run the code without clicking the run button
    }
}
