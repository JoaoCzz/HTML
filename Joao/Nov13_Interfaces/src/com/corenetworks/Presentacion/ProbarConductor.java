package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Coche1;
import com.corenetworks.Modelo.Conductor;


public class ProbarConductor {
    public static void main(String[] args) {
        Coche1 c1= new Coche1(50);
        Conductor c2= new Conductor(c1);
        System.out.println(c2.conducir());


    }
}
