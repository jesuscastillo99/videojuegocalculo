/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jesus
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private int nocontrol;
    private String carrera;
    private String contrasenia;
    
    public Alumno(){
        nocontrol=0;
        nombre=apellidos=carrera=contrasenia="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(int nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
