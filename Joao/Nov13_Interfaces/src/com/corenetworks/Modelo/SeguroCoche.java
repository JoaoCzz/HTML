package com.corenetworks.Modelo;

public class SeguroCoche{
    private iTaller taller;
    private String aseguradora;

    public String reparar(Coche c){
        return taller.reparar(c);

    }

    public SeguroCoche() {
    }

    public SeguroCoche(iTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public iTaller getTaller() {
        return taller;
    }

    public void setTaller(iTaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
