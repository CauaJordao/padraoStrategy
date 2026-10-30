package padraoStrategy;

public class FormaPagamentoDebito implements FormaPagamento {

    public float calcularValorFinal(float subtotal, int parcelas) {
        return subtotal;
    }
}
