public class TiendaOnline {
    private Producto producto;
    private Cliente cliente;
    private Pedido pedido;
    private Fecha fecha;

    public TiendaOnline(Producto producto, Cliente cliente, Pedido pedido, Fecha fecha) {
        this.productoEnVenta = producto;
        this.clienteActual = cliente;
        this.pedidoRealizado = pedido;
        this.fechaDeOperacion = fecha;
    }
    public String comprar() {
        pedidoRealizado.quitarStock();
        return "Procesado: La compra se ha completado correctamente.";
    }

    public String verProductos() {
        return "Catálogo: " + productoEnVenta.mostrarProducto();
    }

    public String realizarPedido() {
        return pedidoRealizado.pedidoRealizado() + " [" + pedidoRealizado.verEstado() + "]";
    }