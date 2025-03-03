package NivelFacil.Arrays.Desafio1;

public class Ninjas {
    String name;
    int age;
    String mission;
    char missionLevel;
    boolean missionComplete;

    public Ninjas(String name, int age, String mission, char missionLevel, boolean missionComplete) {
        this.name = name;
        this.age = age;
        this.mission = mission;
        this.missionLevel = missionLevel;
        this.missionComplete = missionComplete;
    }

    public String showNinjaData() {
        if (age < 15 && missionLevel == 'A' || missionLevel == 'B') {
            this.missionComplete = false;
        } else {
            this.missionComplete = true;
        }

        return "Ninja: " + name + ". " + mission + ". Status: " + (missionComplete ? "concluída" : "não concluída");
    }
}
