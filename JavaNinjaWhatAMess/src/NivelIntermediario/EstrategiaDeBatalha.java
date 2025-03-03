package NivelIntermediario;

public interface EstrategiaDeBatalha {
    // TUDO EM INTERFACES É FINAL, OU SEJA, CONSTANTES
    void estrategiaDeBatalha();

    void inteligenciaDeCombate();

    // sobrecarga de método
    void inteligenciaDeCombate(int qi);
}
