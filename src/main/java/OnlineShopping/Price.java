package OnlineShopping;

import java.math.BigDecimal;

public class Price {
    //DECLARACION DE VARIABLES
    private BigDecimal precio_incial;
    private BigDecimal precio_descuento;
    //CONSTRUCTOR

    public Price(BigDecimal precio_incial, BigDecimal precio_descuento) {
        this.precio_incial = precio_incial;
        this.precio_descuento = precio_descuento;
    }

    //MÉTODOS GETTERS Y SETTERS
    public BigDecimal getPrecio_incial() {
        return precio_incial;
    }

    public void setPrecio_incial(BigDecimal precio_incial) {
        this.precio_incial = precio_incial;
    }

    public BigDecimal getPrecio_descuento() {
        return precio_descuento;
    }

    public void setPrecio_descuento(BigDecimal precio_descuento) {
        this.precio_descuento = precio_descuento;
    }
}
