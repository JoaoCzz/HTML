package com.corenetworks.Modelo;

public class ClienteDAO {
    private IDAO conexion;

    @Override
    public String toString() {
        return "ClienteDAO{" +
                "conexion=" + conexion +
                '}';
    }

    public String insertar(Cliente c1) {
        return conexion.insertar(c1);
    }

    public ClienteDAO() {
    }

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
