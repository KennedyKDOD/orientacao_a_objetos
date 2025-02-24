package com.mycompany.app;

import static org.junit.Assert.assertEquals;  // ✅ JUnit 4
import org.junit.Test;

import com.mycompany.app.Model.Pessoa;

public class PessoaTest {
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("Jess");
        assertEquals("Jess", pessoa.getNome());
    }
}
