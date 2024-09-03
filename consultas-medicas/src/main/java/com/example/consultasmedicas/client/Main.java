package com.example.consultasmedicas.client;

import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        clearScreen();
        System.out.println(
                "Bem-vindo ao sistema de gerenciamento de consultas médicas. Nosso sistema conta com 3 casos de uso atualmente e pode ser testado via"
                        +
                        " terminal. Esperamos que tenha uma experiência agradável. Em caso de dúvidas, entre em contato.");
        System.out.println("");

        while (opcao != 4) {
            System.out.println("-=-=- Menu de Gerenciamento de Casos de Uso -=-=-");
            System.out.println("1. Agendar Consulta");
            System.out.println("2. Criar Consulta pelo Médico");
            System.out.println("3. Alterar consulta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            clearScreen();

            switch (opcao) {
                case 1:
                    ScheduleAppointmentCase.main(null);
                    System.out.println("\nPressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 2:
                    CreateAppointmentByDoctorCase.main(null);
                    System.out.println("\nPressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 3:
                    AlterationAppointmentCase.main(null);
                    System.out.println("\nPressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
            clearScreen();
        }

        scanner.close();
    }
}
