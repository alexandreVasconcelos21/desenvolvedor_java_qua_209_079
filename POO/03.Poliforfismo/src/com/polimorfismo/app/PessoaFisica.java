package com.polimorfismo.app;

public class PessoaFisica extends Pessoa{

    //atributos

    public String nome;
    public String cpf;
    public String dataNascimento;


    public PessoaFisica(String nome, String cpf, String dataNascimento, String telefone, String email,  String endereco) {
        super(telefone, email, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String cumprimentar(){

        return " Olá, meu nome é " + this.nome + " nasci no dia " + this.dataNascimento + 
        "meu cpf é " + this.cpf + ", moro no endereço" + this.endereco + " meu telefone é " + this.telefone + 
        "e meu e-mail é " + this.email +".";
    }



}
