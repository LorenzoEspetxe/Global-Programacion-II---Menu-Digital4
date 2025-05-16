import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String razonSocial;
    private int cuil;

    private List<Sucursal> sucursales;

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
        if(sucursales == null) sucursales = new ArrayList<>();
        sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal){
        if(sucursales.contains(sucursal)) sucursales.remove(sucursal);
    }

}