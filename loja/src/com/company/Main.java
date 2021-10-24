package com.company;
import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var funcionario = new Funcionario();
        var loja = new Loja();
        var pedido = new Pedido();

        System.out.println("Primeiro digite os dados do funcionario: ");

        String nome_funcionario = JOptionPane.showInputDialog("Nome completo: ");
        funcionario.setNome(nome_funcionario);

        String cpf_func = JOptionPane.showInputDialog("CPF: ");
        funcionario.setId(cpf_func);

        String salario_funcionario = JOptionPane.showInputDialog("Sálario: ");
        funcionario.salario = Float.parseFloat(salario_funcionario);

        System.out.println("O funcionario vai cadastrar os produtos disponiveis: ");
        String cadastrar_produto = JOptionPane.showInputDialog("Nome do produto: ");
        funcionario.cadastrarProduto(cadastrar_produto);

        System.out.println("Produtos Disponiveis: ");
        System.out.printf("%s\n", loja.getProduto());

        while (true){
            String pedido_selecionado = JOptionPane.showInputDialog(
                    "Quais desses produtos você deseja: %s\n [1],", loja.getProduto()
            );
            if(pedido_selecionado == "1"){
                pedido_selecionado = cadastrar_produto;
                String data_emissao = JOptionPane.showInputDialog("Digite a data de emissao: ");
                funcionario.cadastrarPedido(pedido_selecionado,data_emissao);
                break;
            }else {
                System.out.println("Digite [1]: ");
                pedido_selecionado = JOptionPane.showInputDialog(
                        "Quais desses produtos você deseja: %s\n [1], ou [2];", loja.getProduto()
                );
            }
        }

        while (true){

            String edt_pedido = JOptionPane.showInputDialog(
                    "Deseja editar o pedido ou remove-lo ?: Sim [1]\n Não [2]\n Remover[3],"
            );

            if(edt_pedido == "1"){

                edt_pedido = JOptionPane.showInputDialog(
                        "Quais desses produtos você deseja: %s\n [1], ou [2];", loja.getProduto()
                );
                String data_emissao = JOptionPane.showInputDialog("Digite a data de emissao: ");

                loja.editarPedido(edt_pedido,data_emissao);

                break;
            }
            else if(edt_pedido == "2") {
                break;
            }
            else if(edt_pedido == "3") {
                loja.removerPedido();
                break;
            }
            else {
                System.out.println("Digite uma opção valida ");
                edt_pedido = JOptionPane.showInputDialog(
                        "Quais desses produtos você deseja: %s\n [1], ou [2];", loja.getProduto()
                );
            }
        }

        while(true){
            String cadastro_val = JOptionPane.showInputDialog("Desaja ser cadastrado?\n [1] para sim \n [2] não ");

            if (cadastro_val == "1"){
                String nome_cliente = JOptionPane.showInputDialog("Digite seu nome: ");
                String cpf_cliente = JOptionPane.showInputDialog("Digite seu CPF: ");
                String tel_cliente = JOptionPane.showInputDialog("Digite seu telefone: ");
                funcionario.cadastrarCliente(nome_cliente,cpf_cliente,tel_cliente);
                break;
            }else if(cadastro_val == "2"){
                System.out.println("Adeus: ");
                break;
            }else {
                System.out.println("Digite uma opção válida: ");
                cadastro_val = JOptionPane.showInputDialog("Desaja ser cadastrado?\n [1] para sim \n [2] não ");
            }
        }


        loja.buscarPedido();



    }
}
