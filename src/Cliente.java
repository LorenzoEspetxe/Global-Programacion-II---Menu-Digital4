import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
    private ImagenCliente imagenCliente;
    private Set<Domicilio> domicilios;
    private Set<Pedido> pedidos;

    public Cliente(){}

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Usuario usuario, ImagenCliente imagenCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.imagenCliente = imagenCliente;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setImagenCliente(ImagenCliente imagenCliente) {
        this.imagenCliente = imagenCliente;
    }

    // metodos
    public void addDomicilio(Domicilio domicilio){
        if(domicilios == null) domicilios = new HashSet<>();
        domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio){
        if(domicilios.contains(domicilio)) domicilios.remove(domicilio);
    }

    public void addPedido(Pedido pedido){
        if(pedidos == null) pedidos = new HashSet<>();
        pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido){
        if(pedidos.contains(pedido)) pedidos.remove(pedido);
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido + " - Usuario: " + usuario;
    }
}
