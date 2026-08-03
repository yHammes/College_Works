import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Numero do pedido: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int numeroPedido = scanner.nextInt();

            System.out.println("Digite o nome do cliente:");
            String nomeCliente = scanner.next();

            System.out.println("Digite o valor da compra:");
            int valorCompra = scanner.nextInt();

            System.out.println("Digite o tipo do pedido (1 Nacional, 2 Internacional):");
            int tipoPedido = scanner.nextInt();

            if (tipoPedido == 1) {
                PedidoNacional pedido = new PedidoNacional(numeroPedido, nomeCliente, valorCompra, StatusPedidos._AGUARDANDO_PAGAMENTO);
                pedido.realizarPagamento();
            } else if (tipoPedido == 2) {
                PedidoInternacional pedido = new PedidoInternacional(numeroPedido, nomeCliente, valorCompra, StatusPedidos._AGUARDANDO_PAGAMENTO);
                pedido.realizarPagamento();
            } else {
                System.out.println("Tipo de pedido inválido: " + tipoPedido);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }

    }
}
