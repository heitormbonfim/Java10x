package NivelFacil.Arrays.Condicoes;

public class ifEelse {
    public static void main(String[] args) {
        // if e else
        // Objetivo: Passar o ninja de nível de acordo com o número de missões

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 1;
        boolean hokage = false;
        short numeroDeMissoes = 10;

        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }
        else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }
        else {
            System.out.println("Rank: Gennin");
        }
    }
}
