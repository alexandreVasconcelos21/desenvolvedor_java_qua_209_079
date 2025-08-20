package com.atividade06.model;

import com.atividade06.interfaces.Dados;

public class Veiculo implements Dados{

    private String marca;
    private String modelo;
    private String anoDoVeiculo;
    private String placa;
    private String cor;
    private Pessoa proprietario;
    



    


    public Veiculo(String marca, String modelo, String anoDoVeiculo, String placa, Pessoa proprietario, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.placa = placa;
        this.proprietario = proprietario;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDoVeiculo() {
        return this.anoDoVeiculo;
    }

    public void setAnoDoVeiculo(String anoDoVeiculo) {
        this.anoDoVeiculo = anoDoVeiculo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public String getcor() {
        return this.cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    @Override
    public String exibirdados() {
        
        return 
        " Nome do Proprietario " + this.proprietario.getNome() + 
        "\n CPF do Proprietario: " + this.proprietario.getCpf() + 
        "\n Endereço do Proprietario: " + this.proprietario.getEndereço() +
        "\n E-mail do Proprietario: " + this.proprietario.getEmail() +
        "\n Telefone do Proprietario: " + this.proprietario.getTelefone() +
        "\n Data de nascimento do Proprietario: " +this.proprietario.getDataNascimento()+
        "\n Modelo do veículo: " + this.modelo +
        "\n Marca do veículo: " + this.marca +
        "\n Placa do veículo: " +this.placa + 
        "\n Ano do veículo " + this.anoDoVeiculo;

    }
    

    
    
    

}
