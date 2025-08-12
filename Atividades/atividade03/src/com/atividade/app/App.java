package com.atividade.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.printf("Digite o nome do titular: ");
        String nome = leia.nextLine();

        System.out.printf("Digite o CPF do titular: ");
        String cpf = leia.nextLine();

        Conta Conta = new Conta(nome, cpf);

        int opcao;

        do {
            System.out.println("\n--- MENU ---\n");
            System.out.println("1. Exibir dados da conta");
            System.out.println("2. Fazer saque");
            System.out.println("3. Fazer depósito");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: \n");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Conta.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = leia.nextDouble();
                    Conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = leia.nextDouble();
                    Conta.depositar(valorDeposito);; 
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

      leia.close();
    }
}
