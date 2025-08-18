package com.regras.app;

import com.regras.model.Conta;  

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        
    Conta cc = new Conta(null, null, "1510-8", "4563-9", 0);


        System.out.println(" Digite o nome do titular da conta: ");
            cc.setTitular(leia.nextLine());
        System.out.println(" Informe o CPF: ");
            cc.setCpf(leia.nextLine());


        //menu

        int opcao;
        do{

            System.out.println("\n--- MENU ---\n");
            System.out.println("1. Exibir dados da conta");
            System.out.println("2. Fazer saque");
            System.out.println("3. Fazer depósito");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: \n");
            opcao = leia.nextInt();

            

switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = leia.nextDouble();
                    cc.fazerSaque(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = leia.nextDouble();
                    cc.fazerDeposito(valorDeposito);; 
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }



        }while (opcao != 4);






    






    leia.close();
    }
}
