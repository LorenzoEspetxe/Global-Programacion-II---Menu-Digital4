import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> setDetalleInsumos;

    public ArticuloManufacturado(String nombre, UnidadDeMedida unidadDeMedida, Integer tiempoEstimadoMinutos) {
        super(nombre, unidadDeMedida);
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public Set<ArticuloManufacturadoDetalle> getSetDetalleInsumos() {
        return setDetalleInsumos;
    }

    public void agregarDetalleInsumos(ArticuloManufacturadoDetalle detalleInsumos) {
        if (setDetalleInsumos == null) setDetalleInsumos = new HashSet<>();
        this.setDetalleInsumos.add(detalleInsumos);
    }

    public void borrarDetalleInsumos(ArticuloManufacturadoDetalle detalleInsumos) {
        this.setDetalleInsumos.remove(detalleInsumos);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", setDetalleInsumos=" + setDetalleInsumos +
                '}';
    }
}
