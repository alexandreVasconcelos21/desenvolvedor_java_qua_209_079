package com.repeticao.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //instancia o objeto scanner
    Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;
        double altura;

        
        //faça ..... enquanto

        do{
            //menu

            System.out.println("1 - Registrar nova entrada. ");
            System.out.println("2 - Sair do Programa.");
            System.out.println();
            System.out.printf("Infome a opção desejada: ");
                opcao = leia.nextInt();


            if (opcao == 1) {
                leia.nextLine();
                System.out.println();
                 System.out.printf("Informe o nome: ");
                    nome = leia.nextLine();
                 System.out.printf("Informe a idade: ");
                    idade= leia.nextInt();
                 System.out.printf("Informe a altura: ");
                    altura = leia.nextDouble();


                // verificar idade e altura

            if (idade>= 12 && altura >= 1.15){
               System.out.println();
                System.out.println(nome + "Está autorizado. ");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println(nome + " não está autorizado");
            }
            }
            else if(opcao != 2){
                System.out.println("Opção inválida");
            }

        } while (opcao != 2);






   //fecha objeto leia

        leia.close();
    }
    
}
