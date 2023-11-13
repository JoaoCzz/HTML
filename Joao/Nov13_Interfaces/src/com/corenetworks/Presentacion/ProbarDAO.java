package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.*;

public class ProbarDAO {
    public static void main(String[] args) {
        Cliente c1= new Cliente("Paco","41548548484");
        IDAO accesoP= new AccesoProduccion();
        ClienteDAO cd= new ClienteDAO(accesoP);
        System.out.println(cd.insertar(c1));
        IDAO accesoD= new AccesoDesarrollo();
        cd.setConexion(accesoD);
        System.out.println(cd.insertar(c1));





    }
}
