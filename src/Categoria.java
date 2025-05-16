import java.util.HashSet;
import java.util.Set;

public class Categoria {

    private String denominacion;

    private Categoria categoriaPadre;
    private Set<Categoria> setDeSubCategorias;

    public Categoria(){}

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    // setters

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public Set<Categoria> getSetDeSubCategorias() {
        return setDeSubCategorias;
    }

    // metodos

    public void addCategoria(Categoria categoria){
        if(setDeSubCategorias == null) setDeSubCategorias = new HashSet<>();
        if(!setDeSubCategorias.contains(categoria)){
           setDeSubCategorias.add(categoria);
           categoria.setCategoriaPadre(this);
        }
    }

    public void removeCategoria(Categoria categoria){
        if (setDeSubCategorias.contains(categoria)) setDeSubCategorias.remove(categoria);
    }

    @Override
    public String toString() {
        return denominacion;
    }
}

