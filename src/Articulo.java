
import java.util.HashSet;
import java.util.Set;

public abstract class Articulo {
    private String nombre;
    private Double precioVenta;
    private UnidadDeMedida unidadDeMedida;
    private Set<Imagen> setDeImagenes;

    public Articulo(String nombre, UnidadDeMedida unidadDeMedida) {
        this.nombre = nombre;
        this.unidadDeMedida = unidadDeMedida;
    }

    public Articulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadDeMedida getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(UnidadDeMedida unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public Set<Imagen> getSetDeImagenes() {
        return setDeImagenes;
    }

    public void agregarImagen(Imagen imagen) {
        if (setDeImagenes == null) setDeImagenes = new HashSet<>();
        this.setDeImagenes.add(imagen);
    }

    public void borrarImagen(Imagen imagen) {
        this.setDeImagenes.remove(imagen);
    }

    @Override
    public String toString() {
        return "Articulo: " + nombre + " - " + unidadDeMedida + '.';
    }
}
