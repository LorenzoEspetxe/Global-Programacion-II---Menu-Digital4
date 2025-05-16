import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String denominacion;

    private Categoria categoriaPadre;
    private List<Categoria> categorias;

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

    // metodos

    public void addCategoria(Categoria categoria){
        if(categorias == null) categorias = new ArrayList<>();
        if(!categorias.contains(categoria)){
           categorias.add(categoria);
           categoria.setCategoriaPadre(this);
        }
    }

    public void removeCategoria(Categoria categoria){
        if (categorias.contains(categoria)) categorias.remove(categoria);
    }

}

