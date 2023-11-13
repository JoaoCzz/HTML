package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.*;

public class ProbarAseguradora {
    public static void main(String[] args) {
        Coche c1= new Coche("1234MAB","Seat Leon");
        iTaller tMecanico = new TallerMecanico();
        SeguroCoche s1= new SeguroCoche(tMecanico,"Mapfre");
        System.out.println(s1.reparar(c1));
        iTaller tPintura= new TallerPinturo();
       s1.setTaller(tPintura);
        System.out.println(s1.reparar(c1));

    }
}
