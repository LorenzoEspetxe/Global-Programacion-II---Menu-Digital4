public class Imagen {
    private String nombre;
    private String urlImagen; // Lo cambie porque me parecio que se equivocaron en el UML.

    public Imagen(String nombre, String urlImagen) {
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String denominacion) {
        this.nombre = denominacion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "(Imagen: " + nombre + " - " + urlImagen + ')';
    }
}
