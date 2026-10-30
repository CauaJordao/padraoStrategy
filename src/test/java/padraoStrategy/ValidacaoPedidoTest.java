package padraoStrategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidacaoPedidoTest {
    @Test
    void naoAceitaSubtotalNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Pedido(-10f));
    }

    @Test
    void naoAceitaEstrategiaNula() {
        assertThrows(NullPointerException.class, () -> new Pedido(10f).calcularValorFinal(null));
    }
}
