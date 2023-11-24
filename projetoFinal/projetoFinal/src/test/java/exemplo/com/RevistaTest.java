package exemplo.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    private Revista revista;

    @BeforeEach
    void setUp() {
        revista = new Revista();
        revista.setTitulo("National Geographic");
        revista.setEdicao("Janeiro 2023");
        revista.setPeriodicidade("Mensal");
        revista.cadastrar(); // Supõe que cadastrar inicialmente funciona corretamente
    }

    @Test
    void testConsultar() {
        assertDoesNotThrow(() -> revista.consultar());
        // Verificar os dados retornados, se possível
    }

    @Test
    void testAtualizar() {
        revista.setEdicao("Fevereiro 2023");
        assertDoesNotThrow(() -> revista.atualizar());
        // Verificar se a revista foi atualizada corretamente no banco de dados
    }

    @Test
    void testExcluir() {
        assertDoesNotThrow(() -> revista.excluir());
        // Verificar se a revista foi excluída corretamente do banco de dados
    }
}
