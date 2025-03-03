package NivelFacil.Arrays.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int numaroMaximoDeClones = 40;

//        int numeroDeClones = 0;

//        while (numeroDeClones < numaroMaximoDeClones) {
//            numeroDeClones++;
//            String clonePhrase = (numeroDeClones == 1) ? " clone" : " clones";
//            System.out.println("O Naruto fez " + numeroDeClones + clonePhrase);
//        }

        for (int i = 1; i <= numaroMaximoDeClones; i++) {
            String clonePhrase = (i == 1) ? " clone" : " clones";
            System.out.println("O Naruto fez " + i + clonePhrase);
        }
    }
}
