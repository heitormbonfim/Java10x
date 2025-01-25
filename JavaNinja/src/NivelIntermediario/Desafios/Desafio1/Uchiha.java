package NivelIntermediario.Desafios.Desafio1;

public class Uchiha extends Ninja {
    private String specialSkill = "Sharingan";

    public void specialSkill() {
        System.out.println("Special skill: " + specialSkill);
    }

    @Override
    public void showAllNinjaData() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getVillage());
        System.out.println(this.getMission());
        System.out.println(this.getMissionLevel());
        System.out.println(this.isMissionStatus());
        System.out.println(this.specialSkill);
    }

    public String changeNinjaSpecialSkill(String specialSkill){
        this.specialSkill = specialSkill;
        return this.specialSkill;
    }

    public String getSpecialSkill(){
        return this.specialSkill;
    }
}
