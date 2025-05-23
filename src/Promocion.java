import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {

    private String denominacion;
    private LocalDate fecheDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;

    private Set<Imagen> imagenes;
    private Set<Articulo> articulos;

    public Promocion(){}

    public Promocion(String denominacion, LocalDate fecheDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fecheDesde = fecheDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    // setters
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setFecheDesde(LocalDate fecheDesde) {
        this.fecheDesde = fecheDesde;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    // metodos

    public void addImagen(Imagen imagen){
        if(imagenes == null) imagenes = new HashSet<>();
        imagenes.add(imagen);
    }

    public void removeImagen(Imagen imagen){
        if(imagenes.contains(imagen)) imagenes.remove(imagen);
    }

    public void addArticulo(Articulo articulo){
        if(articulos == null) articulos = new HashSet<>();
        articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo){
        if(articulos.contains(articulo)) articulos.remove(articulo);
    }

}
