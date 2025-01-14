package Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int maxSize = 10;
        int ninjasAdded = 0;
        String[] ninjas = new String[maxSize];

        Scanner sc = new Scanner(System.in);

        int option = 0;

        while (option != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    if (ninjasAdded < 10) {
                        System.out.println("Escreva o nome do ninja:");
                        String newNinja = sc.nextLine();
                        ninjas[ninjasAdded] = newNinja;
                        ninjasAdded++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("Limite máximo de ninjas atingido");
                    }
                    break;

                case 2:
                    System.out.println("Listando Ninjas:");
                    if (ninjas.length == 0) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        System.out.println("=========== Ninjas Cadastrados ===========");

                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null) {
                                System.out.println(ninjas[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    option = 3;
                    System.out.println("Até logo, tchau!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }



        sc.close();
    }
}
