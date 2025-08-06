package com.contador.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         //instancia o objeto scanner
        Scanner leia = new Scanner(System.in);

        int n;

        System.out.printf("Informe um número inteiro: ");
        n = leia.nextInt();


        //enquanto 

        while (n >= 0) {
            System.out.println("Contagem " + n);
            n--;
        }


        //fecha objeto leia

        leia.close();


    }
}
