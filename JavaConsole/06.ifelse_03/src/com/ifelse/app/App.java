package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

     //instancia o objeto scanner
        Scanner leia = new Scanner(System.in);

        // entrada de dados

        String nome;
        double nota;



        // entrada de dados 

        System.out.println(" Escreva nome: ");
        nome = leia.nextLine();
        System.out.println( " Escreva a nota: ");
        nota = leia.nextInt();


        // notas 

    if( nota >= 0 && nota <= 10 ){

        if( nota >= 7 ){ System.out.println(nome + " Está aprovado") ;} 
        else if (nota >=5 ) {System.out.println(nome + " Está de recuperação"); }
        else{ System.out.println( nome + " Está reprovado");}


    }

    else{
        System.out.println("Nota Invalida ");
    }
    
    //fecha objeto leia
        leia.close();
       

    }
}
