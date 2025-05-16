public class DetallePedido {

    private int cantidad;
    private double subTotal;

    private Articulo articulo;

    public DetallePedido(){}

    public DetallePedido(int cantidad, double subTotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
    }

    // setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "DetallePedido: " + articulo.getNombre() + " x " + cantidad + " / SubTotal=" + subTotal;
    }
}
