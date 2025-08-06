package com.escolha.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
           //instancia o objeto scanner
        Scanner leia = new Scanner(System.in);


        // declaração de variáveis
         

        int x, y ;
        double result;
        String operação;

        


        //entrada de dados
        
        System.out.println("Informe o valor de x: ");
        x = leia.nextInt();
        System.out.println(" Informe o valor de y: ");
        y = leia.nextInt();

        //limpeza de buffer

        leia.nextLine();


        //menu
        System.out.println(" Escolha a operação: ");
        System.out.println(" 1 - Somar. ");
        System.out.println(" 2 - Subtrair. ");
        System.out.println(" 3 - Multiplicar. ");   
        System.out.println(" 4 - Dividir. ");
        System.out.println("Operação desejada");
        operação = leia.nextLine();

        //escolha caso

        switch (operação) {
            case "1":  
            result = x + y;
            System.out.println(" O resultado da soma é:" + result);
            break;
            case "2":  
            result = x - y;
            System.out.println(" O resultado da subtração é:" + result);
            break;
            case "3":  
            result = x * y;
            System.out.println(" O resultado da multiplicação é:" + result);
            break;
            case "4":  
            result = x/y;
            System.out.println(" O resultado da divisão é:" + result);
            break;
            

            default:
            System.out.println("Opção Invalida");

        }



        //fecha objeto leia

        leia.close();
    }
}
