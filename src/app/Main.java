package app;
import model.*;

public class Main {

    public static void main(String[] args) {

        // PedidoComida: Se aplica poliformismo.
        Pedido pedidoComida = new PedidoComida(
                "01-Pizza",
                "Av. Providencia 123",
                "Comida"
        );

        pedidoComida.asignarRepartidor();

        // PedidoEncomienda: se aplica polimorfismo.
        Pedido pedidoEncomienda = new PedidoEncomienda(
                "02-Audífonos",
                "Av. Providencia 456",
                "Encomienda"
        );
        pedidoEncomienda.asignarRepartidor();

        // PedidoExpress: se aplica polimorfismo.
        Pedido pedidoExpress = new PedidoExpress(
                "03-Medicamentos",
                "Av. Providencia 789",
                "Express"
        );

        pedidoExpress.asignarRepartidor();

    }

}
