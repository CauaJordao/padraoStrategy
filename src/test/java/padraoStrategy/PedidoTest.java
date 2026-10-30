package padraoStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    public void deveAplicarDescontoDeCincoPorCentoParaPix() {
        Pedido pedido = new Pedido(100f);

        float valorFinal = pedido.calcularValorFinal(new FormaPagamentoPix());

        assertEquals(95f, valorFinal, 0.001f);
    }

    @Test
    public void deveManterValorIntegralParaCartaoDebito() {
        Pedido pedido = new Pedido(100f);

        float valorFinal = pedido.calcularValorFinal(new FormaPagamentoDebito());

        assertEquals(100f, valorFinal, 0.001f);
    }

    @Test
    public void deveManterValorIntegralParaCartaoCreditoComTresParcelasOuMenos() {
        Pedido pedido = new Pedido(100f);
        pedido.setParcelas(3);

        float valorFinal = pedido.calcularValorFinal(new FormaPagamentoCredito());

        assertEquals(100f, valorFinal, 0.001f);
    }

    @Test
    public void deveAplicarJurosParaCartaoCreditoComMaisDeTresParcelas() {
        Pedido pedido = new Pedido(100f);
        pedido.setParcelas(5);

        float valorFinal = pedido.calcularValorFinal(new FormaPagamentoCredito());

        // 2 parcelas excedentes (5 - 3), 2% de juros por parcela: 100 + (100 * 0.02 * 2) = 104
        assertEquals(104f, valorFinal, 0.001f);
    }

    @Test
    public void deveTratarParcelasInvalidasComoUmaParcelaNoCartaoCredito() {
        Pedido pedido = new Pedido(100f);
        pedido.setParcelas(0);

        float valorFinal = pedido.calcularValorFinal(new FormaPagamentoCredito());

        assertEquals(100f, valorFinal, 0.001f);
    }
}
