package com.company;

public class Loja {

    public Pedido pedido;
    public String produto;
    public Funcionario funcionario;
//    public void setPedido(Pedido pedido){
//        this.pedido = pedido;
//    }


    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto){

        this.produto = produto;
    }


    public void buscarPedido() {

        String pedido_selecionado = pedido.getPedido();
        String data = pedido.getDataEmissao();
        String cpf = pedido.getCpfCliente();
        String tel = pedido.getTelefoneCliente();
        System.out.printf("Pedidos : %s\n", pedido_selecionado);
        System.out.printf("Pedidos : %s\n", data);
        System.out.printf("Pedidos : %s\n", cpf);
        System.out.printf("Pedidos : %s\n", tel);

    }

    public void removerPedido() {
        funcionario.cadastrarPedido("","");
    }

    public void editarPedido(String pedido_editado, String data) {
        funcionario.cadastrarPedido(pedido_editado,data);
    }


}
