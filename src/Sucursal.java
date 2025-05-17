import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;
    private Set<Promocion> promociones;
    private Set<Categoria> categorias;

    public Sucursal(){}

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    // metodos

    public void addPromocion(Promocion promocion){
        if(promociones == null) promociones = new HashSet<>();
        promociones.add(promocion);
    }

    public void removePromocion(Promocion promocion){
        if(promociones.contains(promocion)) promociones.remove(promocion);
    }

    public void addCategoria(Categoria categoria){
        if(categorias == null) categorias = new HashSet<>();
        categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria){
        if(categorias.contains(categoria)) categorias.remove(categoria);
    }

}
