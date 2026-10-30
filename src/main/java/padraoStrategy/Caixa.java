package padraoStrategy;

public class Caixa {

    private float valorPago;

    public float getValorPago() {
        return valorPago;
    }

    public void pagarComPix(float subtotal) {
        Pedido pedido = new Pedido(subtotal);
        this.valorPago = pedido.calcularValorFinal(new FormaPagamentoPix());
    }

    public void pagarComDebito(float subtotal) {
        Pedido pedido = new Pedido(subtotal);
        this.valorPago = pedido.calcularValorFinal(new FormaPagamentoDebito());
    }

    public void pagarComCredito(float subtotal, int parcelas) {
        Pedido pedido = new Pedido(subtotal);
        pedido.setParcelas(parcelas);
        this.valorPago = pedido.calcularValorFinal(new FormaPagamentoCredito());
    }
}
