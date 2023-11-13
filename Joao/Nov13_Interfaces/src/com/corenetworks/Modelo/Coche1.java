package com.corenetworks.Modelo;

import java.util.IllegalFormatCodePointException;

public class Coche1 implements iVehiculo{
    private int deposito;


    @Override
    public String toString() {
        return "Coche1{" +
                "deposito=" + deposito +
                '}';
    }

    public String moverse() {
        if (deposito>0){
            return "El coche se esta moviendo";
        }else{
            return "Falta gasolina";
        }

    }

    public Coche1() {
    }

    public Coche1(int deposito) {
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
