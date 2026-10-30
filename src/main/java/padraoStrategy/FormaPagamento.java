package padraoStrategy;

public interface FormaPagamento {

    float calcularValorFinal(float subtotal, int parcelas);
}