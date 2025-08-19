package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(null, 
        null, 
        null, 
        null, 
        null) ;

        Conta cc = new Conta("1234-5", 
        "12378-9", 
        0, 
        usuario);

        String[] opcoes = {"Exibir dados da conta", "Fazer depósito", "Fazer saque", "Sair" };

        Object opcao;


        //input do titular da conta

        usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta: "));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta: "));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o E-mail do titular da conta: "));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do titular da conta: "));
        usuario.setEndereco(JOptionPane.showInputDialog("Informe o Endereço titular da conta: "));



        do {

            opcao = JOptionPane.showInternalInputDialog(null, "Escolha a operação desejada:", "Banco Java", JOptionPane.QUESTION_MESSAGE,
             null, opcoes, opcoes[0]);

             switch (opcao.toString()) {

                case "Exibir dados da conta":
                    JOptionPane.showMessageDialog(null, cc.exibirSados(), null, JOptionPane.INFORMATION_MESSAGE); 
                                 break;


                
             }
            
        } while (opcao != "Sair");


    }
}
