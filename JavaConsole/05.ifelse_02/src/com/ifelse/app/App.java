package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            //instancia o objeto scanner
            
        Scanner leia = new Scanner(System.in);


        //declaração de váriaveis 

        String nome;
        int idade;
        double altura;

        //entrada de dados

        System.out.println("Infome seu nome: ");
        nome = leia.nextLine();
        System.out.println("Infome sua Idade: ");
        idade = leia.nextInt();
        System.out.println("Informe sua altura em metros: ");
        altura = leia.nextDouble();


        //saida de dados 

        if(idade >=12 && altura >= 1.5 ){

            System.out.println(nome + " Está autorizado");
        }

        else{
            System.out.println( nome + " Não está autorizado");
        }
        
        
        
        //fecha objeto leia

        leia.close();

    }
}
