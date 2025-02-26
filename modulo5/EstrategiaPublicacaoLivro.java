package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

// Implementação específica para publicação de livros
public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {
    @Override
    public void publicar() {
        System.out.println("Publicando livro...");
    }
}
