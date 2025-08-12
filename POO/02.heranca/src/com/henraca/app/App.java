package com.henraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // instancia a classe PessoaFisica

    Scanner leia = new Scanner(System.in);
    PessoaFisica usuario = new PessoaFisica();
    PessoaJuridica empresa = new PessoaJuridica();


    // defininco valores dos atributos do usuario
   
    System.out.println(" Informe o nome do usuário: ");
    usuario.nome = leia.nextLine();
     System.out.println(" Informe o cpf do usuário: ");
    usuario.cpf = leia.nextLine();
     System.out.println(" Informe o email do usuário: ");
    usuario.email = leia.nextLine();
     System.out.println(" Informe o telefone do usuário: ");
    usuario.telefone = leia.nextLine();
     System.out.println(" Informe o endereço do usuário: ");
    usuario.endereco = leia.nextLine();



        //definincndo valores dos atributos da empresa
        System.out.println(" Informe a razão social da emprea: ");
        empresa.razaoSocial = leia.nextLine();
        System.out.println(" Informe o nome fantasia da emprea: ");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println(" Informe o email da emprea: ");
        empresa.email = leia.nextLine();
        System.out.println(" Informe o cnpj da emprea: ");
        empresa.cnpj = leia.nextLine();
        System.out.println(" Informe a telefone da emprea: ");
        empresa.telefone = leia.nextLine();
         System.out.println(" Informe o endereço da emprea: ");
        empresa.endereco = leia.nextLine();




//output

System.out.println(" Nome do usuario " + usuario.nome);
System.out.println(" cpf do usuario " + usuario.cpf);
System.out.println(" email do usuario " + usuario.email);
System.out.println(" telefone do usuario " + usuario.telefone);
System.out.println(" endereço do usuario " + usuario.endereco);
System.out.println(" Razão social da empresa:  " + empresa.razaoSocial);
System.out.println(" Nome Fantasia da empresa:  " + empresa.nomeFantasia);
System.out.println(" CNPJ da empresa:  " + empresa.cnpj);
System.out.println(" E-mail da empresa:  " + empresa.email);
System.out.println(" Telefone da empresa:  " + empresa.telefone);
System.out.println(" Endereço da da empresa:  " + empresa.endereco);



    leia.close();

    }
}
