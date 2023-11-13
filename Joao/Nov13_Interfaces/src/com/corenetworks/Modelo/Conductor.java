package com.corenetworks.Modelo;

public class Conductor{
    private iVehiculo v1;

    @Override
    public String toString() {
        return "v1{" +
                "v1=" + v1 +
                '}';
    }

    public String conducir(){
        return v1.moverse();
    }

    public Conductor() {
    }

    public Conductor(iVehiculo v1) {
        this.v1 = v1;
    }

}
 
       
    


