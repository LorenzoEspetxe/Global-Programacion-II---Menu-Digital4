import java.util.HashSet;
import java.util.Set;

public class Empresa {

    private String nombre;
    private String razonSocial;
    private int cuil;

    private Set<Sucursal> sucursales;

    public Empresa(){}

    public Empresa(String nombre, String razonSocial, int cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    // metodos
    public void addSucursal(Sucursal sucursal){
        if(sucursales == null) sucursales = new HashSet<>();
        sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal){
        if(sucursales.contains(sucursal)) sucursales.remove(sucursal);
    }

}