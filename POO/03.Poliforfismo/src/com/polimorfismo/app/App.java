package com.polimorfismo.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //instancia

        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);





        //atributos dos usuarios
     System.out.println(" Informe o nome do usuário: ");
         usuario.nome = leia.nextLine();
     System.out.println(" Informe o cpf do usuário: ");
        usuario.cpf = leia.nextLine();
    System.out.println(" Informe a data de nascimento do usuário: ");
        usuario.dataNascimento = leia.nextLine();
     System.out.println(" Informe o email do usuário: ");
        usuario.email = leia.nextLine();
     System.out.println(" Informe o telefone do usuário: ");
        usuario.telefone = leia.nextLine();
     System.out.println(" Informe o endereço do usuário: ");
        usuario.endereco = leia.nextLine();


        //atributos da empresa

    System.out.println(" Informe a razão social da emprea: ");
        empresa.razaoSocial = leia.nextLine();
     System.out.println(" Informe o nome da emprea: ");
        empresa.nomeFantasia = leia.nextLine();
    System.out.println(" Informe o email da emprea: ");
            empresa.email = leia.nextLine();
    System.out.println(" Informe o CNPJ da emprea: ");
            empresa.cnpj = leia.nextLine();
    System.out.println(" Informe a telefone da emprea: ");
        empresa.telefone = leia.nextLine();
    System.out.println(" Informe o endereço da emprea: ");
        empresa.endereco = leia.nextLine();




        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());



        leia.close();


    }
}
