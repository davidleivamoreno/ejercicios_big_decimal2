package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Posicion {
    //DECLARACIÓN DE VARIABLES
    private BigDecimal latitud;
    private BigDecimal longitud;
    private BigDecimal RadioTierraKm = new BigDecimal(6378.0);

    //DECLARACIÓN DE CONSTRUCTOR
    public Posicion(BigDecimal latitud, BigDecimal longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //DECLARACIÓN DE GETTERS Y SETTERS
    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public BigDecimal getRadioTierraKm() {
        return RadioTierraKm;
    }

    public void setRadioTierraKm(BigDecimal radioTierraKm) {
        RadioTierraKm = radioTierraKm;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }


    public BigDecimal distanciaKM(Posicion posorigen, Posicion posdestino) {
        BigDecimal difLatitud = (posdestino.latitud.subtract(posorigen.latitud));
        BigDecimal difLongitud = (posdestino.longitud.subtract(posorigen.longitud));

        difLongitud = EnRadianes(difLongitud);
        difLatitud = EnRadianes(difLatitud);
        // Math.Sin(difLatitud/2).AlCuadrado()
        //DIVIDO LA OPERACION PARA CALCULAR a POR SUMANDOS
        var primersumando = BigDecimal.valueOf(Math.sin(difLatitud.divide(BigDecimal.TWO, 4, RoundingMode.HALF_UP).pow(2).doubleValue()));
        var segundosumando = BigDecimal.valueOf(Math.cos(EnRadianes(posorigen.latitud).doubleValue()));
        var tercersumando = BigDecimal.valueOf(Math.cos(EnRadianes(posdestino.latitud).doubleValue()));
        var cuartosumando = BigDecimal.valueOf(Math.sin(difLongitud.divide(BigDecimal.TWO, 4, RoundingMode.HALF_UP).pow(2).doubleValue()));
        var multiplicacion = segundosumando.multiply(tercersumando.multiply(cuartosumando));
        var a = multiplicacion.add(primersumando);

        BigDecimal unomenosa = BigDecimal.ONE.subtract(a);
        double raiz = unomenosa.sqrt(MathContext.DECIMAL128).doubleValue();
        BigDecimal c = BigDecimal.valueOf(2).multiply(BigDecimal.valueOf(Math.atan2(a.sqrt(MathContext.DECIMAL128).doubleValue(), raiz)));

        // Calcular la distancia
        BigDecimal distancia = RadioTierraKm.multiply(c);

        return distancia;


    }
//DESARROLLO EL MÉTODO EnRadianes QUE CONVIERTE EL VALOR BigDecimal A RADIANES.
    public BigDecimal EnRadianes(BigDecimal valor) {


        // .ToSingle(Math.PI / 180) * valor
        BigDecimal pi = new BigDecimal(Math.PI);
        pi.setScale(12, RoundingMode.HALF_UP);
        BigDecimal grados = new BigDecimal(180.00);
        return (pi.divide(grados, 12, RoundingMode.HALF_UP)).multiply(valor);


    }


}

