import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private LocalDate fechaPedido;

    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Factura factura;
    private Set<DetallePedido> detallesPedido;

    public Pedido(){}

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, LocalDate fechaPedido, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, Sucursal sucursal, Domicilio domicilio, Factura factura, DetallePedido detallePedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        // this.factura = factura;                   Los sacamos por que no necesariamente pas el pedido.
        // this.detallePedido = detallePedido;
    }

    // setter
    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void agregarDetallePedido(DetallePedido detalle) {
        if (detallesPedido == null) detallesPedido = new HashSet<>();
        this.detallesPedido.add(detalle);
    }

    public Set<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " + factura + " - " + estado + " - " +  getDetallesPedido();
    }


}
