import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CronometroCosmicoTest {

    private CronometroCosmico cronometroCosmico;

    @BeforeEach
    void setUp() {
        cronometroCosmico = new CronometroCosmico();
    }

    @Test
    void convertirTiempo() {
        assertEquals(486.30136991101983, cronometroCosmico.convertirTiempo(444.0539384));
    }

    @Test
    void calcularLimites() {

    }

    @Test
    void main() {
    }
}