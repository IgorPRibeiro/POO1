package com.company;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void cadastrarProduto(String produto) {
        loja.setProduto(produto);
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
