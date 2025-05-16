public class Domicilio {

    private String calle;
    private int numero;
    private int codigoPostal;

    private Localidad localidad;

    public Domicilio(){}

    public Domicilio(String calle, int numero, int codigoPostal, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
    }

    // setters
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Domicilio: " + calle + " " + numero + ", " +localidad + ". " + "Codigo Postal: " + codigoPostal + ".";
    }

}
