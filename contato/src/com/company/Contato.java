package com.company;

public class Contato {
    String nome;
    String celular;
    String email;
    String instagram;
    String data_nascimento;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    boolean validarInstagram() {
        if(instagram.startsWith("@")) {
            return true;
        }else {
            return false;
        }
    }

    boolean validarEmail() {
        if(email.contains("@")) {
            if(email.contains(".")){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

}
