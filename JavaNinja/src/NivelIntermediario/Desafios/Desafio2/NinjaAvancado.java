package NivelIntermediario.Desafios.Desafio2;

public class NinjaAvancado implements Ninja {
    String name;
    int age;
    String village;
    TipoHabilidade specialSkill;

    public NinjaAvancado(String name, int age, String village, TipoHabilidade specialSkill) {
        this.name = name;
        this.age = age;
        this.village = village;
        this.specialSkill = specialSkill;
    }

    public NinjaAvancado() {}

    @Override
    public void mostrarInformacoes() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.village);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade especial: " + this.specialSkill);
    }
}
