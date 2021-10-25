package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        var funcionario = new Funcionario();
        var loja = new Loja();
        var pedido = new Pedido();

        funcionario.setLoja(loja);

        loja.setPedido(pedido);

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

        while (true) {
            String pedido_selecionado = JOptionPane.showInputDialog("Quais desses produtos você deseja: [1],",
                    loja.getProduto());
            if (pedido_selecionado.equals("1")) {
                pedido_selecionado = cadastrar_produto;
                String data_emissao = JOptionPane.showInputDialog("Digite a data de emissao: ");
                pedido.cadastrarPedido(pedido_selecionado, data_emissao);
                break;
            } else {
                System.out.println("Digite [1]: ");
                pedido_selecionado = JOptionPane.showInputDialog("Quais desses produtos você deseja: %s\n [1], ou [2];",
                        loja.getProduto());
            }
        }

        while (true) {

            String edt_pedido = JOptionPane
                    .showInputDialog("Deseja editar o pedido ou remove-lo ?: Sim [1]\n Não [2]\n Remover[3],");

            if (edt_pedido.equals("1")) {

                edt_pedido = JOptionPane.showInputDialog("Quais desses produtos você deseja: %s\n [1], ou [2];",
                        loja.getProduto());
                String data_emissao = JOptionPane.showInputDialog("Digite a data de emissao: ");

                loja.editarPedido(edt_pedido, data_emissao);

                break;
            } else if (edt_pedido.equals("2")) {
                break;
            } else if (edt_pedido.equals("3")) {
                loja.removerPedido();
                break;
            } else {
                System.out.println("Digite uma opção valida ");
                edt_pedido = JOptionPane.showInputDialog("Quais desses produtos você deseja: %s\n [1], ou [2];",
                        loja.getProduto());
            }
        }

        while (true) {
            String cadastro_val = JOptionPane.showInputDialog("Deseja ser cadastrado?\n [1] para sim \n [2] não ");

            if (cadastro_val.equals("1")) {
                String nome_cliente = JOptionPane.showInputDialog("Digite seu nome: ");
                String cpf_cliente = JOptionPane.showInputDialog("Digite seu CPF: ");
                String tel_cliente = JOptionPane.showInputDialog("Digite seu telefone: ");
                pedido.cadastrarCliente(nome_cliente, cpf_cliente, tel_cliente);
                break;
            } else if (cadastro_val.equals("2")) {
                System.out.println("Programa Encerrado ");
                break;
            } else {
                System.out.println("Digite uma opção válida: ");
                cadastro_val = JOptionPane.showInputDialog("Desaja ser cadastrado?\n [1] para sim \n [2] não ");
            }
        }

        loja.buscarPedido();
    }
}
