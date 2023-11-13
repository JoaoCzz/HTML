package com.corenetworks.Modelo;

public class TallerPinturo implements iTaller{

    @Override
    public String reparar(Coche c) {
        return "El coche "+c.getModelo()+" "+ c.getMatricula()+ " esta pintandose";
    }
}
