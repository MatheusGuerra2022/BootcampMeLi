package com.example.demo;

public class Teste {


    String nome;
    String idade;

    public Teste(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Teste() {

    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
