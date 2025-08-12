package com.atividade.app;

public class Conta {

 public String nome;
    public String cpf;
    public  String agencia;
    public  String numeroConta;
    public  double saldoInicial;


//construtor 




    public Conta (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = "0002";
        this.numeroConta = "545465465";
        this.saldoInicial = 0.0;
    }

     public void exibirDados() {
        System.out.println("\n--- Dados da Conta ---\n");
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println(" Seu saldo é: " + this.saldoInicial);
    }

    

     public void sacar(double valor) {
        if (valor > 0 && valor <= saldoInicial) {
            saldoInicial -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    // depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldoInicial += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
