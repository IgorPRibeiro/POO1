package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	    Funcionario funcionario = new Funcionario();

        //Input data
        System.out.println("INSIRA SEUS DADOS: ");

        System.out.println("Nome: ");
        funcionario.setNome(input.nextLine());

        System.out.println("Matricula: ");
        funcionario.setMatricula(input.nextInt());

        System.out.println("Sario Bruto: ");
        funcionario.setSalarioBruto(input.nextDouble());

        System.out.println("Dependentes: ");
        funcionario.setDependente(input.nextInt());

        System.out.println("");

        //Show data
        System.out.println("SEUS DADOS:");

        System.out.println("Nome: "+ funcionario.nome);
        System.out.println("Matricula: "+ funcionario.matricula);
        System.out.println("Sario Bruto: "+ funcionario.salarioBruto);
        System.out.println("Dependentes: "+ funcionario.dependente);

        System.out.println("");

        //Show functions
        System.out.println("TOTAL: ");

        System.out.printf("Valor do desconto: %.1f\n",funcionario.calcularDesconto());
        System.out.printf("Salario Liquido: %.1f\n", funcionario.calcularSalarioLiquido());
        System.out.printf("Gastos plano de saude: %.1f\n", funcionario.gastosPlanoSaude());
        System.out.printf("Gastos em Vale alimentação: %.1f\n", funcionario.valorValeAlimentacao());

        System.out.println("");

        input.close();

    }
}
