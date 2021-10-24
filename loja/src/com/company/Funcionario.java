package com.company;

import java.util.Date;

public class Funcionario {
    public String nome;
    public String id;
    public float salario;
    public Pedido pedido;
    public Loja loja;

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public float getSalario() {
        return salario;
    }

    public void  setNome(String nome) {
       this.nome = nome;
    }

    public void  setId(String id){
        this.id = id;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public void cadastrarCliente(String nome,String tel,String cpf){
        pedido.setNomeCliente(nome);
        pedido.setCpfCliente(cpf);
        pedido.setTelefoneCliente(tel);
    }

    public void cadastrarProduto(String produto) {
        loja.setProduto(produto);
    }

    public void cadastrarPedido(String pedido, String data_emissao) {
        this.pedido.setPedido(pedido);
        this.pedido.setDataEmissao(data_emissao);
    }

}
