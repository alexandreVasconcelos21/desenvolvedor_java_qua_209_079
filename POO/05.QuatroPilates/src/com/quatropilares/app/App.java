package com.quatropilares.app;

import java.util.Scanner;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);


         //atributos dos usuarios
     System.out.printf(" Informe o nome do usuário:");
         usuario.setNome(leia.nextLine());

     System.out.printf("\n Informe o cpf do usuário: ");
        usuario.setCpf(leia.nextLine());

    System.out.printf("\n Informe a data de nascimento do usuário: ");
        usuario.setDataNascimento(leia.nextLine());

     System.out.printf("\n Informe o email do usuário: ");
        usuario.setEmail(leia.nextLine());

     System.out.printf("\n Informe o telefone do usuário: ");
        usuario.setTelefone(leia.nextLine());

     System.out.printf("\n Informe o endereço do usuário: ");
        usuario.setEndereco(leia.nextLine());


         //atributos da empresa

    System.out.printf("\n Informe a razão social da emprea: ");
        empresa.setRazaoSocial(leia.nextLine());

     System.out.printf("\n Informe o nome da emprea: ");
        empresa.setNomeFantasia(leia.nextLine());

    System.out.printf("\n Informe o email da emprea: ");
            empresa.setEmail(leia.nextLine());

    System.out.printf("\n Informe o CNPJ da emprea: ");
            empresa.setCnpj(leia.nextLine());

    System.out.printf("\n Informe a telefone da emprea: ");
        empresa.setTelefone(leia.nextLine());

    System.out.printf("\n Informe o endereço da emprea: ");
        empresa.setEndereco(leia.nextLine());



        //output do usuario 

        System.out.println( "\n ----Informações do Usuário----\n");
        System.out.println("Nome:" + usuario.getNome());
        System.out.println("CPF:" + usuario.getCpf());
        System.out.println("Data de Nascimento:" + usuario.getDataNascimento());
        System.out.println("E-mail" + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());


        //output da empresa

        System.out.println("\n ----Informações da empresa---- \n");
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("E-mail: " + empresa.getEmail());
        System.out.println("Endereço da empresa: " + empresa.getEndereco());








        leia.close();

    }
}
