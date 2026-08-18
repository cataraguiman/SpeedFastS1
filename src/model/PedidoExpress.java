package model;
// Subclase 3: hereda o extiende de la clase Pedido.
public class PedidoExpress extends Pedido {

    // Constructor de la subclase que inicializa los atributos heredados de Pedido.
    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Sobrescritura.
    @Override
    public void asignarRepartidor() {

        System.out.println(" || PEDIDO EXPRESS || ");
        System.out.println(" Asignando repartidor...");
        System.out.println(" Repartidor más cercano con disponibilidad inmediata confirmado");
        System.out.println("Pedido asignado a Nicolas Donoso");
    }
}
