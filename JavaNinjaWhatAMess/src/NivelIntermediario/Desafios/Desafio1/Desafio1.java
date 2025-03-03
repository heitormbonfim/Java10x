package NivelIntermediario.Desafios.Desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Uchiha[] Uchihas = new Uchiha[10];
        Ninja[] Ninjas = new Ninja[10];
        int UchihaMaxSize = 10;
        int NinjaMaxSize = 10;

        String option = "";
        boolean breakLoop = false;
        int countUchiha = 0;
        int countNinja = 0;

        while (!breakLoop) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1. Cadastrar Uchiha");
            System.out.println("2. Cadastrar Ninja");
            System.out.println("3. Editar Ninja");
            System.out.println("4. Listar Ninjas");
            System.out.println("5. Listar Ninjas Com Habilidades Especiais");
            System.out.println("6. Muidar habilidade especial dos Uchihas");
            System.out.println("7. Sair");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    if (countUchiha >= UchihaMaxSize) {
                        System.out.println("Número máximo de Uchihas atingido");
                        break;
                    }
                    Uchihas[countUchiha] = new Uchiha();
                    System.out.println("Digite o nome do Uchiha:");
                    Uchihas[countUchiha].setName(scanner.nextLine());
                    System.out.println("Digite a idade do Uchiha:");
                    Uchihas[countUchiha].setAge(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Digite a missão do Uchiha:");
                    Uchihas[countUchiha].setMission(scanner.nextLine());
                    System.out.println("Digite o nível da missão do Uchiha:");
                    Uchihas[countUchiha].setMissionLevel(scanner.nextLine());
                    System.out.println("Ninja Uchiha Cadastrado com Sucesso");

                    countUchiha++;
                    break;
                case "2":
                    if (countNinja >= NinjaMaxSize) {
                        System.out.println("Número máximo de Ninjas atingido");
                        break;
                    }
                    Ninjas[countNinja] = new Ninja();
                    System.out.println("Digite o nome do Ninja:");
                    Ninjas[countNinja].setName(scanner.nextLine());
                    System.out.println("Digite a idade do Ninja:");
                    Ninjas[countNinja].setAge(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Digite a missão do Ninja:");
                    Ninjas[countNinja].setMission(scanner.nextLine());
                    System.out.println("Digite o nível da missão do Ninja:");
                    Ninjas[countNinja].setMissionLevel(scanner.nextLine());
                    System.out.println("Ninja Cadastrado com Sucesso");
                    countNinja++;
                    break;

                case "3":
                    System.out.println("Editar Ninja: ");
                    System.out.println("É Uchiha?:");
                    System.out.println("1. Sim");
                    System.out.println("2. Não");
                    String isUchiha = scanner.nextLine();
                    if (isUchiha.equals("1")) {
                        System.out.println("Nome do Uchiha: ");
                        String uchihaName = scanner.nextLine();
                        for (int i = 0; i < Uchihas.length; i++) {
                            if (Uchihas[i] == null) {
                                System.out.println("Uchiha não encontrado");
                                break;
                            }

                            if (uchihaName.equals(Uchihas[i].getName())) {
                                System.out.println("Editar missão:");
                                String newMission = scanner.nextLine();
                                Uchihas[i].setMission(newMission);
                                System.out.println("Missão comprida:");
                                System.out.println("1. Sim");
                                System.out.println("2. Não");
                                String missionComplete = scanner.nextLine();
                                if (missionComplete.equals("1")) {
                                    Uchihas[i].setMissionStatus(true);
                                } else if (missionComplete.equals("2")) {
                                    Uchihas[i].setMissionStatus(false);
                                } else {
                                    System.out.println("Opção inválida");
                                    break;
                                }
                            }
                            if (i == Uchihas.length) {
                                System.out.println("Ninja Uchiha não encontrado");
                            }
                        }
                    } else if (isUchiha.equals("2")) {
                        System.out.println("Nome do Ninja:");
                        String ninjaName = scanner.nextLine();
                        for (int i = 0; i < Ninjas.length; i++) {
                            if (Ninjas[i] == null) {
                                System.out.println("Ninja não encontrado");
                                break;
                            }

                            if (ninjaName.equals(Ninjas[i].getName())) {
                                System.out.println("Editar missão:");
                                String newMission = scanner.nextLine();
                                Ninjas[i].setMission(newMission);
                                System.out.println("Missão comprida: ");
                                System.out.println("1. Sim");
                                System.out.println("2. Não");
                                String missionComplete = scanner.nextLine();
                                if (missionComplete.equals("1")) {
                                    Ninjas[i].setMissionStatus(true);
                                } else if (missionComplete.equals("2")) {
                                    Ninjas[i].setMissionStatus(false);
                                } else {
                                    System.out.println("Opção inválida");
                                    break;
                                }
                            }
                            if (i == Ninjas.length) {
                                System.out.println("Ninja não encontrado");
                            }
                        }
                    } else {
                        System.out.println("Opção inválida");
                        break;
                    }
                    break;

                case "4":
                    System.out.println("==== Uchihas Cadastrados ====");
                    for (int i = 0; i < Uchihas.length; i++) {
                        if (Uchihas[i] != null) {
                            String ninja = i + 1 + ". " + Uchihas[i].getName() + " - Missão: " + Uchihas[i].getMission();
                            System.out.println(ninja);
                        }
                    }

                    System.out.println("==== Ninjas Cadastrados ====");
                    for (int i = 0; i < Ninjas.length; i++) {
                        if (Ninjas[i] != null) {
                            String ninja = i + 1 + ". " + Ninjas[i].getName() + " - Missão: " + Ninjas[i].getMission();
                            System.out.println(ninja);
                        }
                    }
                    break;

                case "5":
                    System.out.println("==== Ninjas Com Habilidades Especiais");
                    for (int i = 0; i < Ninjas.length; i++) {
                        if (Uchihas[i] == null) break;
                        System.out.println(i + 1 + ". " + Uchihas[i].getName() + " - Habilidade especial: " + Uchihas[i].getSpecialSkill());
                    }
                    break;

                case "6":
                    System.out.println("Mudar habilidade especial dos Uchihas: ");
                    String newSpecialSkill = scanner.nextLine();
                    for (int i = 0; i < Uchihas.length; i++) {
                        if (Uchihas[i] == null) break;

                        Uchihas[i].changeNinjaSpecialSkill(newSpecialSkill);
                    }
                    System.out.println("Nova habilidade especial: " + newSpecialSkill);
                    break;

                case "7":
                    System.out.println("Saindo...");
                    breakLoop = true;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
