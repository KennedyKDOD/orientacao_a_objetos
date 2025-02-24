package com.mycompany.app;

import static org.junit.Assert.assertEquals;  // ✅ JUnit 4
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class EmprestimoTest {

    @Test
    public void testGetDataRetirada() {
        String dataRetirada = "08/05/2024";
        String dataDevolucao = "15/05/2024";
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", "Autor Tradicional"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }
}
