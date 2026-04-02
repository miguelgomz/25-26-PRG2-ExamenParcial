public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String codigo;

    public Producto(String nombre, double precio, int stock, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = codigo;
    }

    public String mostrarProducto() {
        return nombre + " - " + precio + "€";
    }

    public String verStock() {
        return "Stock actual: " + stock;
    }

    