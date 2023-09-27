package org.iesvdm;

import java.math.BigInteger;

public class Factorial {


    private long n;
    private BigInteger factorial;

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

    public void setFactorial(BigInteger factorial) {
        this.factorial = factorial;
    }

    public Factorial(long n) {
        if (n >= 0)
            this.n = n;
        else
            throw new RuntimeException("Valor " + n + " no permitido.");
    }

    public BigInteger calcula() {
        //TODO
        this.factorial = new BigInteger("1");
        this.factorial = BigInteger.valueOf(1);
        this.factorial = BigInteger.ONE;
        for (long i = 2; i <= this.n; i++) {
            this.factorial = this.factorial.multiply(BigInteger.valueOf(i));
        }
        return this.factorial;
    }

    public BigInteger calcula(int n) {
        this.factorial = new BigInteger("1");
        this.factorial = BigInteger.valueOf(1);
        this.factorial = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            this.factorial = this.factorial.multiply(BigInteger.valueOf(i));
        }
        return this.factorial;
    }

    @Override
    public String toString() {
        return "El factorial es " + calcula();
    }

}
