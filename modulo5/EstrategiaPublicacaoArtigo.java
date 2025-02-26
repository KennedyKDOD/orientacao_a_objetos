package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

// Implementação específica para publicação de artigos
public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {
    @Override
    public void publicar() {
        System.out.println("Publicando artigo...");
    }
}
