package com.corenetworks.Modelo;

public class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Se esta insertando el cliente: " + c1.getNombre()+" "+ c1.getNIF();
    }
}
