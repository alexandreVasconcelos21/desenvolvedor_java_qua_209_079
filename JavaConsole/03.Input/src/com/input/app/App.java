package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner leia= new Scanner(System.in);


        // declaração de variavaies

        String nome;
        String email;
        int idade; 

        //input( entrada de dados):

        System.out.println( "Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:" );
        idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();


        System.out.println( " Informe seu email: ");
        email = leia.nextLine();


        //output (saida de dados)
        System.out.println( "Seu nome é: " + nome +".");
        System.out.println(" Você tem: "+ idade + " Anos ");
        System.out.println( "Seu email é: " + email + ".");


        //fechar objeto

        leia.close();
    }
}
