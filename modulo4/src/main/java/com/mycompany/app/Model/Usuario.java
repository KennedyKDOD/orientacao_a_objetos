package com.mycompany.app.Model;

public class Usuario extends Autor {
    private int idade;

    public Usuario(String nome, int idade) {
        super(nome, "Desconhecida", "Usuário Autor"); // Define como "Usuário Autor" por padrão
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
