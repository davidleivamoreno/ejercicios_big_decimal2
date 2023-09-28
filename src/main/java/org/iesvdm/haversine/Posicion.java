package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.MathContext;
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


        BigDecimal RadioTierraKm = new BigDecimal(6378.0);
        public BigDecimal distanciaKM(Posicion posorigen,Posicion posdestino){
            BigDecimal difLatitud=(posdestino.latitud.subtract(posorigen.latitud));
            BigDecimal difLongitud=(posdestino.longitud.subtract(posorigen.longitud));

            difLongitud=EnRadianes(difLongitud);
            difLatitud=EnRadianes(difLatitud);
            // Math.Sin(difLatitud/2).AlCuadrado()

            var primersumando=  BigDecimal.valueOf(Math.sin(difLatitud.divide(BigDecimal.TWO,4,RoundingMode.HALF_UP).pow(2).doubleValue()));
            var segundosumando= BigDecimal.valueOf(Math.cos(EnRadianes(posorigen.latitud).doubleValue()));
            var tercersumando=BigDecimal.valueOf(Math.cos(EnRadianes(posdestino.latitud).doubleValue()));
            var cuartosumando=BigDecimal.valueOf(Math.sin(difLongitud.divide(BigDecimal.TWO,4,RoundingMode.HALF_UP).pow(2).doubleValue()));
            var multiplicacion=segundosumando.multiply(tercersumando.multiply(cuartosumando));
          var  a=multiplicacion.add(primersumando);

            BigDecimal unomenosa=BigDecimal.ONE.subtract(a);
            double raiz=unomenosa.sqrt(MathContext.DECIMAL128).doubleValue();
            BigDecimal c = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.atan2(a.sqrt(MathContext.DECIMAL128).doubleValue(), raiz)));

            // Calcular la distancia
            BigDecimal distancia = RadioTierraKm.multiply(c);

            return distancia;
            //TODO

        }
        public BigDecimal EnRadianes(BigDecimal valor)
        {


            // .ToSingle(Math.PI / 180) * valor
            BigDecimal pi=new BigDecimal(Math.PI);
            pi.setScale(12, RoundingMode.HALF_UP);
            BigDecimal grados=new BigDecimal(180.00);
            return (pi.divide(grados,12,RoundingMode.HALF_UP)).multiply(valor);


        }



}

