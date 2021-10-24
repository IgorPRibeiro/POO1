package com.company;

import java.util.Date;

public class Pedido {

    public String pedido;
    public String dataEmissao;
    public String nomeCliente;
    public String telefoneCliente;
    public String cpfCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getPedido() {
        return pedido;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }



}
