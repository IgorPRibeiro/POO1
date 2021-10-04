package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	    Contato contato = new Contato();

        System.out.println("INSIRA SEUS DADOS");

        System.out.println("Nome:");
        contato.setNome(input.nextLine());

        System.out.println("Celular:");
        contato.setCelular(input.nextLine());

        System.out.println("Email:");
        contato.setEmail(input.nextLine());

        System.out.println("Instagram:");
        contato.setInstagram(input.nextLine());

        System.out.println("Data de Nascimento:");
        contato.setIdade(input.nextInt());

       System.out.println("");

        //Show data
        System.out.println("SEUS DADOS:");

        System.out.println("Nome: "+ contato.nome);
        System.out.println("Celular: "+ contato.celular);
        System.out.println("Email: "+ contato.email);
        System.out.println("Data de Nascimento: "+ contato.data_nascimento);
        System.out.println("Idade: "+ contato.idade);

        System.out.println("");


        if(contato.validarInstagram() == true){
            System.out.println('1');
        }else {
            System.out.println('0');
        }
        if(contato.validarEmail() == true){
            System.out.println('1');
        }else {
            System.out.println('0');
        }



    }
}
