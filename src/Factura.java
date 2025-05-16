import java.time.LocalDate;

public class Factura {

     private LocalDate fechaFacturacion;
     private int mpPaymentId;
     private int mpMerchantOrderId;
     private String myPreferenceId;
     private String myPaymentType;
     private FormaPago formaPago;
     private double totalVenta;

     public Factura(){}

    public Factura(LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String myPreferenceId, String myPaymentType, FormaPago formaPago, double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.myPreferenceId = myPreferenceId;
        this.myPaymentType = myPaymentType;
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

    public void setMyPreferenceId(String myPreferenceId) {
        this.myPreferenceId = myPreferenceId;
    }

    public void setMyPaymentType(String myPaymentType) {
        this.myPaymentType = myPaymentType;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

}
