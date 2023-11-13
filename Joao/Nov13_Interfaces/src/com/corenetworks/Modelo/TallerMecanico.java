package com.corenetworks.Modelo;

public class TallerMecanico implements iTaller{


    @Override
    public String reparar(Coche c) {
        return "El coche "+c.getModelo() +" "+ c.getMatricula() +" se esta reparando";
    }

}
