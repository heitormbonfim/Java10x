package NivelIntermediario.Desafios.Desafio1;

public class Ninja {
    private String name;
    private String village;
    private int age;
    private String mission;
    private String missionLevel;
    private boolean missionStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMissionLevel() {
        return missionLevel;
    }

    public void setMissionLevel(String missionLevel) {
        this.missionLevel = missionLevel;
    }

    public boolean isMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(boolean missionStatus) {
        this.missionStatus = missionStatus;
    }

    public void showAllNinjaData() {
        System.out.println(this.name);
        System.out.println(this.village);
        System.out.println(this.age);
        System.out.println(this.mission);
        System.out.println(this.missionLevel);
        System.out.println(this.missionStatus);
    }
}
