package com.polimorfismo.app;

abstract public class Pessoa {
         //atributos
    public String telefone;
    public String email;
    public String endereco;


    public Pessoa(String telefone, String email, String endereco) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
public String cumprimentar(){
    return null;
}
}
