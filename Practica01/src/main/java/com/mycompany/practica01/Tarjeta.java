package com.mycompany.practica01;

public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;

    public Tarjeta(int numero, float saldo, boolean activo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean recargar(float monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean consumir() {
        if (this.saldo >= this.precio && this.activo) {
            this.saldo -= this.precio;
            return true;
        }
        return false;
    }
}
