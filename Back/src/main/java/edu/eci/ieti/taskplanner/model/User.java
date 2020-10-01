package edu.eci.ieti.taskplanner.model;

import java.util.Date;
import java.util.LinkedList;

public class User {
    private String id;
    private String correo;
    private String nombre;
    private String password;

    public User(){
    }

    public User(String id, String correo, String nombre, String password) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
