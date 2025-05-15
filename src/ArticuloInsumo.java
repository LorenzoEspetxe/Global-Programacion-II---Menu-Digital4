public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public ArticuloInsumo(String denominacion, UnidadDeMedida unidadDeMedida, Boolean esParaElaborar) {
        super(denominacion, unidadDeMedida);
        this.esParaElaborar = esParaElaborar;
    }

    public ArticuloInsumo() {
        // llama implicitamente al super()
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public void aumentarStockActual(Integer nuevoStock) {
        this.stockActual = this.stockActual + nuevoStock;
    }

    public void disminuirStockActual(Integer salidaDeStock) {
        this.stockActual = this.stockActual - salidaDeStock;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Boolean getEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(Boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }

}
