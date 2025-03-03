package NivelFacil.Arrays.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Tipos não primitivos têm métodos
        * Dados não primitivos: String, Array, Class (mesmo class do public class), enum
        * Objetivo: Criar um ninja e atribuir métodos a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println(nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaNome = aldeia.split(" ")[2];
        System.out.println(aldeiaNome);
    }
}
