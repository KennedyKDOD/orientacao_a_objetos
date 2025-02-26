package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;
import com.mycompany.app.Interface.PublicavelInterface;

// Decorador para permitir que um usuário publique de diferentes formas
public class UsuarioDecorator implements PublicavelInterface {
    private PublicavelInterface usuario;
    private EstrategiaPublicacao estrategiaPublicacao;

    public UsuarioDecorator(PublicavelInterface usuario) {
        this.usuario = usuario;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida!");
        }
    }
}
