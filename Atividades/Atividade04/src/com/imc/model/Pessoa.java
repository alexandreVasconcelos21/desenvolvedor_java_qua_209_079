package com.imc.model;

public class Pessoa {

    private String nome;
    private double peso;
    private double altura;



    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    //construtor

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //IMC

    public double calcularIMC(){

            return this.peso/(this.altura*this.altura);

        }

    public String resultadoIMC(double imc){

 

        if(imc <= 18.5 ){
            return " Abaixo do peso";
        } else if (imc < 24.9 ) {
            return " Peso normal ";
        } else if (imc < 29.9) {
            return "Sobre peso";
        }else if (imc < 34.9 ) {
            return " Obsidade grau 1";
        } else if (imc < 39.9) {
            return "Obsidade grau 2";
        } else{
            return " Vai explodir !!! ";
        }

    }
}
