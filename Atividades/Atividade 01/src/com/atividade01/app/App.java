package com.atividade01.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      //instancia o objeto scanner
        Scanner leia = new Scanner(System.in);
        

            // entrada de dados
         String nome;
         int  opção;
         double altura, peso;
         


         do{

            // menu
                System.out.println();
                System.out.println();
            System.out.println( "1 - Calcular");
            System.out.println("2 - Sair do programa");
            System.out.println();
            System.out.printf("Informe a opção desejada: ");
            opção = leia.nextInt();
            


            if (opção ==1 ) {
                System.out.println();
                leia.nextLine();
                System.out.printf("Infome seu nome: ");
                    nome= leia.nextLine();
                System.out.printf("Informe sua altura em metros: ");
                    altura = leia.nextDouble();
                System.out.printf("Informe seu peso: ");
                    peso = leia.nextDouble();
            
            // declaração da váriavel imc
        double imc = peso/ (altura*altura);
        

        if (imc <= 18.5 ) {
            System.out.printf(nome + " Está a baixo do peso");  
        
        }
        else if( imc <24.99){
            System.out.printf(nome + " Está no peso normal");
        }
         else if( imc <29.99){
            System.out.printf(nome +" Está com sobrepeso");
         }
         else if( imc > 30){
            System.out.printf(nome + " Está com obesidade");
         }
        }
        else if (opção == 2 ){
            System.out.printf("Até Logo!! ");
        }   else if(opção != 2){
            System.out.println();
            System.out.printf("opção invalida");
        }
    
        
         }while (opção != 2); 


         //fecha objeto leia
        leia.close();
    }
}
