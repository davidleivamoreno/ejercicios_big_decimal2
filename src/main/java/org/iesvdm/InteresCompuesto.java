package org.iesvdm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuesto {

    private BigDecimal p;
    private BigDecimal r;
    private int n;
    private BigDecimal c;

    public InteresCompuesto(BigDecimal p, BigDecimal r, int n) {
        this.p = p;
        this.r = r;
        this.n = n;
    }

    public BigDecimal getP() {
        return p;
    }

    public void setP(BigDecimal p) {
        this.p = p;
    }

    public BigDecimal getR() {
        return r;
    }

    public void setR(BigDecimal r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public BigDecimal getC() {
        return c;
    }

    public void setC(BigDecimal c) {
        this.c = c;
    }

    public BigDecimal calculaMontoFinal() {
        //TODO

        // c = p(1 +r)^n
        //Creo una variable para crear el porcentaje a r
        BigDecimal cien = new BigDecimal(100.00);
        BigDecimal percentager = r.divide(cien, 3, RoundingMode.HALF_UP);
        c = p.multiply(percentager.add(BigDecimal.ONE).pow(n));

        return c;
    }

    public String toString() {
        return "El interes compuesto es: " + this.c.setScale(2, RoundingMode.HALF_UP);
    }


}
