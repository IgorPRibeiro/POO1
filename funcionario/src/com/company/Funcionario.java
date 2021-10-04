package com.company;

public class Funcionario {
    String nome;
    int matricula;
    double salarioBruto;
    boolean plano;
    int dependente;

    void setNome(String nome) {
        this.nome = nome;
    }

    void  setMatricula(int matricula) {
        this.matricula = matricula;
    }

    void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    void setPlano(boolean plano) {
        this.plano = plano;
    }

    void setDependente(int dependente){
        this.dependente = dependente;
    }


    double calcularDesconto() {
        double calc_desconto = ((salarioBruto * 13 / 100) * dependente);
        return  calc_desconto;
    }

    double calcularSalarioLiquido() {
        return salarioBruto - calcularDesconto();
    }

    double gastosPlanoSaude() {
        double gasto_plano = (salarioBruto * 2 / 100) ;
        return gasto_plano;
    }

    double valorValeAlimentacao() {
        double vale_alimentacao = (1192.40 + (salarioBruto * 1 / 100)) * dependente;
        return  vale_alimentacao;
    }

}