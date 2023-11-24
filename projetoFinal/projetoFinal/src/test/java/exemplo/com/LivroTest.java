package exemplo.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    private Livro livro;

    @BeforeEach
    void setUp() {
        livro = new Livro();
        livro.setTitulo("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.setEditora("Allen & Unwin");
        livro.cadastrar(); // Supõe que cadastrar inicialmente funciona corretamente
    }

    @Test
    void testConsultar() {
        assertDoesNotThrow(() -> livro.consultar());
        // Aqui você pode verificar se os dados retornados estão corretos, se possível
    }

    @Test
    void testAtualizar() {
        livro.setEditora("HarperCollins");
        assertDoesNotThrow(() -> livro.atualizar());
        // Verificar se o livro foi atualizado corretamente no banco de dados
    }

    @Test
    void testExcluir() {
        assertDoesNotThrow(() -> livro.excluir());
        // Verificar se o livro foi excluído corretamente do banco de dados
    }
}
