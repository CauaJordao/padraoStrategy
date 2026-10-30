package padraoStrategy;

import java.util.Objects;

public class Pedido {

    private float subtotal;
    private int parcelas;

    public Pedido(float subtotal) {
        if (!Float.isFinite(subtotal) || subtotal < 0f) {
            throw new IllegalArgumentException("Subtotal deve ser não negativo e finito");
        }
        this.subtotal = subtotal;
        this.parcelas = 1;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float calcularValorFinal(FormaPagamento formaPagamento) {
        return Objects.requireNonNull(formaPagamento, "Forma de pagamento obrigatória")
                .calcularValorFinal(subtotal, parcelas);
    }
}
