package padraoStrategy;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(200f);
        System.out.printf("Pix: R$ %.2f%n", pedido.calcularValorFinal(new FormaPagamentoPix()));
        System.out.printf("Débito: R$ %.2f%n", pedido.calcularValorFinal(new FormaPagamentoDebito()));
        pedido.setParcelas(5);
        System.out.printf("Crédito em 5x: R$ %.2f%n", pedido.calcularValorFinal(new FormaPagamentoCredito()));
    }
}
