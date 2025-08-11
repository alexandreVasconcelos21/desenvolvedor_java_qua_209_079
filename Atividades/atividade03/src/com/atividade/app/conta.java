package com.atividade.app;

public class conta {

    public String titular;
    private String cpf;
    private String agencia;
    private String numeroConta;
    private double saldo;


//construtor 



    public conta(String titular, String cpf, String agencia, String numeroConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

     public void exibirDados() {
        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }













}




