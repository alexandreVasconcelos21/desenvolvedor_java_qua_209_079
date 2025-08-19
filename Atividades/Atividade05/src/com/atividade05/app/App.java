package com.atividade05.app;

import javax.swing.JOptionPane;

import com.precos.model.Preco;

public class App {
    public static void main(String[] args) throws Exception {

        Preco preço = new Preco(0, 0);

       String[] opcoes = {"Calcular Combustivel" , "Sair"};
       Object opcao;


       double calculadora;

       do {
        
      

       opcao = JOptionPane.showInputDialog(null, "Escolha a opção desejada!!! ", "Qual é o mais barato??", 
       0, null, opcoes, opcoes[0]);

       if (opcao == "Calcular Combustivel") {
        preço.setPrecoEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço do Etanol: ").replace(",", ".")));
        preço.setPrecogasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço da Gasolina: ").replace(",", ".")));

        calculadora = preço.calcularGasolina();

        JOptionPane.showMessageDialog(null, "Qual está compensando mais é  " + String.format("%.2f", calculadora) + "\n" + preço.combustivel(calculadora),
             "Resultado", JOptionPane.INFORMATION_MESSAGE);
       }

         } while (opcao != "Sair");



    }
}
