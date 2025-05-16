import java.time.LocalDate;

public class Factura {

     private LocalDate fechaFacturacion;
     private int mpPaymentId;
     private int mpMerchantOrderId;
     private String mpPreferenceId;
     private String mpPaymentType;
     private FormaPago formaPago;
     private double totalVenta;

     public Factura(){}

    public Factura(LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String myPreferenceId, String myPaymentType, FormaPago formaPago, double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPreferenceId = myPreferenceId;
        this.mpPaymentType = myPaymentType;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }

    // setters
    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public void setMpPaymentId(int mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public void setMpMerchantOrderId(int mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Factura Nro " + mpPaymentId;
    }
}
