package padraoStrategy;

public class FormaPagamentoPix implements FormaPagamento {

    private static final float PERCENTUAL_DESCONTO = 0.05f;

    public float calcularValorFinal(float subtotal, int parcelas) {
        return subtotal - (subtotal * PERCENTUAL_DESCONTO);
    }
}
