package com.atividade2.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia o objeto scanner
        Scanner leia = new Scanner(System.in);

        //entrada de dados
        String nome;
        int idade, opção;


         System.out.printf( "Infome seu nome: ");
                nome = leia.nextLine();
                System.out.printf("Infome sua idade: ");
                idade = leia.nextInt();
        

        do{   

                System.out.println("\n" + "1 - Filme 1 (Maior de 18 anos)");
                System.out.println("2 - Filme 2 (Maior de 16 anos)");
                System.out.println("3 - Filme 3 (Maior que 10 anos)");
                System.out.println("4 - Filme 4 (Maior que 12 anos )");
                System.out.println("5 - Filme 5 (Maior que 14 anos) ");
                System.out.printf("\nEscolha um filme: ");
                 opção = leia.nextInt();

                switch (opção) {
                    case 1: 
                    if( idade >= 18){
                        System.out.println("\n" + nome + " Pode entrar para assistir o filme");
                    } else{
                        System.out.println("\n" + nome + " Não pode entrar na sala");
                    } break;

                    case 2: 
                    if( idade >=16 ){ 
                        System.out.println("\n" + nome + " Pode entrar para assistir o filme");
                    } else{
                        System.out.println("\n" + nome + " Não pode entrar na sala ");
                    }break;

                    case 3: 
                    if(idade >=10 ){
                        System.out.println("\n" + nome + " Pode entrar para assistir o filme");
                    }else{
                        System.out.println("\n" + nome + " Não pode entrar na sala");
                    }break;

                     case 4: 
                    if(idade >=12 ){
                        System.out.println( "\n" + nome + " Pode entrar para assistir o filme");
                    }else{
                        System.out.println("\n" + nome + " Não pode entrar na sala");
                    }break;

                     case 5: 
                    if(idade >=14 ){
                        System.out.println( "\n" + nome + " Pode entrar para assistir o filme"); 
                    }else{
                        System.out.println("\n" + nome + " Não pode entrar na sala");
                    }break;

            
                    default:
                    System.out.println("\nopção invalida");
                    break;
                    
                }break;
                
                 

                
            } while(opção != 0);
            
 

       





        //fecha objeto leia
        leia.close();
        
    }
}
