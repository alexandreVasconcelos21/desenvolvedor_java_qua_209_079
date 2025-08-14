package com.regras.model;

import com.regras.interfaces.IConta;

public class Conta implements IConta {

    private String titular;
    private String cpf;
    private String agencia;
    private String nConta;
    private double saldo;





    public Conta(String titular, String cpf, String agencia, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }



    public void exibirDados(){

        System.out.println(" --- Dados da conta ---\n");
        System.out.println("nome: " + this.titular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.nConta);
        System.out.println(" Seu saldo é: " + this.saldo);
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public void exibibitDados() {
        System.out.println("Nome do titular: " + this.titular);
        System.out.println("CPF do titular: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.nConta);
        System.out.println("Saldo da conta: R$ " + String.format( "%.2f", this.saldo));
    }


    @Override
    public double fazerDeposito(double valor) { 
            if (valor > 0) {
                this.saldo += valor; 
                System.out.println("Deposito realizado com Sucessso!!");
                    return this.saldo;

            }else{
                System.out.println(" Valor Inválido!! ");
                    return this.saldo;
            }

    }


    @Override
    public double fazerSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        
        }else{
            System.out.println("Valor inválido ");
        }
        return this.saldo;
    }

    
                                    

}
