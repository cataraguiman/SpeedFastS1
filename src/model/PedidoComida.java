package model;

// Subclase 1: hereda o extiende de la clase Pedido.
public class PedidoComida extends Pedido {

    // Constructor de la subclase que inicializa los atributos heredados de Pedido.
    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Sobrescritura.
    @Override
    public void asignarRepartidor() {
        System.out.println(" || PEDIDO COMIDA || ");
        System.out.println("Asignando repartidor..." );
        System.out.println("Verificando mochila térmica...OK");
        System.out.println("Pedido asignado a Peter Parker");
    }
    // Sobrescritura del método sobrecargado.
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
