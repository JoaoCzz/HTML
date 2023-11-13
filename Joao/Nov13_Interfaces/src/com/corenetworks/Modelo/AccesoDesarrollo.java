package com.corenetworks.Modelo;

public class AccesoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Acceso de Desarrollo = "+ c1.getNombre() +" "+ c1.getNIF();
    }
}
