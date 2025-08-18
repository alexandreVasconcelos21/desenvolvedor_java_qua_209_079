package com.precos.model;

public class Preco {

private double precoGasolina;
private double precoEtanol;


   

    public Preco(double precoGasolina, double precoEtanol) {
        this.precoGasolina = precoGasolina;
        this.precoEtanol = precoEtanol;
    }



    public double getPrecogasolina() {
        return this.precoGasolina;
    }

    public void setPrecogasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoetanol() {
        return this.precoEtanol;
    }

    public void setPrecoEtanol(double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }




        public double calcularGasolina(){

            return this.precoEtanol/this.precoGasolina;
        }

    public String combustivel(double Gasolina) {



        if (precoEtanol <= 0.7 * precoGasolina) {
            return "Compensa Etanol ";
        } else{
            return "Compensa Gasolina";
        }

    }


}
