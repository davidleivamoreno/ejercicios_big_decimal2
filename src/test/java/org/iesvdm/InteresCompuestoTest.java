package org.iesvdm;

import org.iesvdm.InteresCompuesto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuestoTest {

    @Test
    public void cuandoPrincipal1000Interes5porcientoY10peridos() {
        //Declaro variables
        String principal = "1000";
        int interes = 5;
        int periodos = 10;

        //TODO
        //Declaro las variables que se nos dan inicialmente para pasarlas a tipo BigDecimal
        BigDecimal principalB = new BigDecimal(principal);
        BigDecimal interesB = new BigDecimal(interes);
        //Declaro el constructor
        InteresCompuesto interesCompuesto = new InteresCompuesto(principalB, interesB, periodos);
        //Declaro la variable cantidadFinal que recoge el resultado de la funcion calculaMontoFinal
        BigDecimal cantidadFinal = interesCompuesto.calculaMontoFinal();
        Assertions.assertEquals(new BigDecimal("1628.89"), cantidadFinal.setScale(2, RoundingMode.HALF_UP));
        System.out.println(interesCompuesto);
    }

}
