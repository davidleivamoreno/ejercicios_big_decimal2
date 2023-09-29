package org.iesvdm.haversine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


public class haversineTest {
    @Test
    public void cuandoDistanciaGranada() {
        //DECLARO LAS VARIABLES lat1 y long1 PARA LA PRIMERA POSICION Igualada.
        //DECLARO LAS VARIABLES lat2 y long2 PARA LA SEGUNDA POSICION Granada.
        BigDecimal lat1 = new BigDecimal(41.57879);
        BigDecimal long1 = new BigDecimal(1.617221);
        BigDecimal lat2 = new BigDecimal(37.176487F);
        BigDecimal long2 = new BigDecimal(-3.597929);
        Posicion Igualada = new Posicion(lat1, long1);
        Posicion Granada = new Posicion(lat2, long2);
        BigDecimal distancia = (Igualada.distanciaKM(Igualada, Granada));

        Assertions.assertEquals(new BigDecimal(664.0), distancia.setScale(0, RoundingMode.HALF_UP));
    }
}
