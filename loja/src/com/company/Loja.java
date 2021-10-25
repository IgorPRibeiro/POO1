package com.company;

public class Loja {

    public Pedido pedido;
    public String produto;
    public Funcionario funcionario;

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {

        this.produto = produto;
    }

    public void buscarPedido() {

        String pedido_selecionado = pedido.getPedido();
        String data = pedido.getDataEmissao();
        String cpf = pedido.getCpfCliente();
        String tel = pedido.getTelefoneCliente();
        if (cpf == null || tel == null) {
            System.out.printf("Nenhum usuario cadastrado");
        } else {
            System.out.printf("Pedidos : %s\n", pedido_selecionado);
            System.out.printf("Data : %s\n", data);
            System.out.printf("Cpf : %s\n", cpf);
            System.out.printf("Tel : %s\n", tel);
        }

    }

    public void removerPedido() {
        pedido.cadastrarPedido("", "");
    }

    public void editarPedido(String pedido_editado, String data) {
        pedido.cadastrarPedido(pedido_editado, data);
    }

}
