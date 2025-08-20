package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;



public class App {
    public static void main(String[] args) throws Exception {
       
        Pessoa proprietario = new Pessoa(null, null, null, null, null, null);
        Veiculo carro = new Veiculo(null, null, null, null, proprietario, null);


        //input proprietario
         proprietario.setNome(JOptionPane.showInputDialog("Informe o nome do dono do veículo: "));
         proprietario.setCpf(JOptionPane.showInputDialog("Informe o cpf do dono do veículo: "));
         proprietario.setEmail(JOptionPane.showInputDialog("Informe o email do dono do veículo: "));
         proprietario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do dono do veículo: "));
         proprietario.setEmail(JOptionPane.showInputDialog("Informe o E-mail do dono do veículo: "));
         proprietario.setEndereço(JOptionPane.showInputDialog("Informe o endereço do dono do veículo: "));
         proprietario.setDataNascimento(JOptionPane.showInputDialog("Informe a Data de nascimento do dono do veículo: "));

         //input do viculo 

         carro.setMarca(JOptionPane.showInputDialog("Informe a marca do  veículo: "));
         carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo: "));
         carro.setAnoDoVeiculo(JOptionPane.showInputDialog("Informe o ano do veículo: "));
         carro.setPlaca(JOptionPane.showInputDialog("Informe a Placa do veículo: "));
         carro.setcor(JOptionPane.showInputDialog("Informe a cor do veículo: "));
         carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo: "));
         carro.setProprietario(proprietario);

            //saida de dados
         JOptionPane.showMessageDialog(null, carro.exibirdados(), "Dados Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
