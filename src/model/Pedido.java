package model;

// Clase base o superclase.
public abstract class Pedido {

    // Atriutos protegidos para darle acceso a otras clases.
    protected String idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    // Constructor vacío.


    public Pedido() {
    }

    // Constructor con atributos.

    public Pedido(String idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Metodo genérico: asignarRepartidor.
    public void asignarRepartidor() {

    }

    // Metodo sobrecargado.
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
