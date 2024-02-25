import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComunicadorInterplanetarioTest {
    private ComunicadorInterplanetario comunicadorInterplanetario;

    @BeforeEach
    void setUp() {
        comunicadorInterplanetario = new ComunicadorInterplanetario();
    }

    @Test
    void contarVocales() {
        assertEquals(0, comunicadorInterplanetario.contarVocales(""));
    }

    @Test
    void invertirMensaje() {

    }

    @Test
    void esPalindromo() {

    }

    @Test
    void main() {
    }
}