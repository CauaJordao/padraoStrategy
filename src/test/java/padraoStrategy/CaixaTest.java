package padraoStrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaTest {

    @Test
    public void devePagarComPixAplicandoDesconto() {
        Caixa caixa = new Caixa();

        caixa.pagarComPix(100f);

        assertEquals(95f, caixa.getValorPago(), 0.001f);
    }

    @Test
    public void devePagarComDebitoSemAlteracao() {
        Caixa caixa = new Caixa();

        caixa.pagarComDebito(100f);

        assertEquals(100f, caixa.getValorPago(), 0.001f);
    }

    @Test
    public void devePagarComCreditoSemJurosParaTresParcelasOuMenos() {
        Caixa caixa = new Caixa();

        caixa.pagarComCredito(100f, 3);

        assertEquals(100f, caixa.getValorPago(), 0.001f);
    }

    @Test
    public void devePagarComCreditoAplicandoJurosParaMaisDeTresParcelas() {
        Caixa caixa = new Caixa();

        caixa.pagarComCredito(100f, 5);

        assertEquals(104f, caixa.getValorPago(), 0.001f);
    }
}
