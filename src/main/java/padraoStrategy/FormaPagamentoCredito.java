package padraoStrategy;

public class FormaPagamentoCredito implements FormaPagamento {

    private static final int PARCELAS_SEM_JUROS = 3;
    private static final float TAXA_JUROS_AO_MES = 0.02f;

    public float calcularValorFinal(float subtotal, int parcelas) {
        int quantidadeParcelas = Math.max(parcelas, 1);

        if (quantidadeParcelas <= PARCELAS_SEM_JUROS) {
            return subtotal;
        }

        int parcelasComJuros = quantidadeParcelas - PARCELAS_SEM_JUROS;
        float juros = subtotal * TAXA_JUROS_AO_MES * parcelasComJuros;
        return subtotal + juros;
    }
}
