package model;
// Subclase 2: hereda o extiende de la clase Pedido
public class PedidoEncomienda extends Pedido {

    // Constructor de la subclase que inicializa los atributos heredados de Pedido.
    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    // Sobrescritura.
    @Override
    public void asignarRepartidor() {
        System.out.println(" || PEDIDO ENCOMIENDA || ");
        System.out.println(" Asignando repartidor...");
        System.out.println("Validando peso y embalaje...OK");
        System.out.println("Pedido asignado a Mary Jane");

    }
}
