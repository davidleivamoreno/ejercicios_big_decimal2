package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Posicion {
    private BigDecimal latitud;
    private BigDecimal longitud;
    public Posicion(BigDecimal latitud, BigDecimal longitud) {
        this.latitud=latitud;
        this.longitud=longitud;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public static class Extensiones
    {
        BigDecimal RadioTierraKm = new BigDecimal(6378.0);
        public BigDecimal distanciaKM(Posicion posorigen,Posicion posdestino){
            BigDecimal difLatitud=(posorigen.latitud.subtract(posdestino.latitud));
            return EnRadianes(difLatitud);
            //TODO
        }
        static BigDecimal EnRadianes(BigDecimal valor)
        {
            // .ToSingle(Math.PI / 180) * valor
            BigDecimal pi=new BigDecimal(Math.PI);
            pi.setScale(2, RoundingMode.HALF_UP);
            BigDecimal grados=new BigDecimal(180.00);
            return (pi.divide(grados,2,RoundingMode.HALF_UP)).multiply(valor);
        }

}
}
