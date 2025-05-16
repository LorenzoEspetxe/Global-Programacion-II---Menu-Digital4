public class Pais {

    private String nombre;

    public Pais(){}

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    // setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
