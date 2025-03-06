package org.example;

public class CuentaBancaria {
    private String titular;
    private int saldo;
    private int numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, int saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }


    public void depositoDinero(int cantidad) {
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("cantidad depositada");
        }else{
            System.out.println("la cantidad no es valida");
        }
    }
    public void retiroDinero(int cantidad){
        if (cantidad<saldo){
            saldo = saldo - cantidad;
            System.out.println("el retido fue exitoso, la cantidad disponble es $"+ saldo);
        }else{
            System.out.println("cantidad no disponible");
        }
    }

}
