package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
//  SwitchCases: Que servem para gerar casos específicos
//  Objetivo: Pedir pro usuário escolher entre os ninjas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecolha um personagem:");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno");

        int userChoice = scanner.nextInt();

        System.out.println("Você digitou o número: " + userChoice);

        switch (userChoice) {
            case 1:
                System.out.println("Você escolheu Naruto");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke");
                break;
            case 3:
                System.out.println("Você escolheu Sakura");
                break;
            default:
                System.out.println("Você não escolheu um número válido");
        }

        scanner.close();
    }
}
