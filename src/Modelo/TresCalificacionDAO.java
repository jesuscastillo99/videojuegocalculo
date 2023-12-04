/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kevin
 */
public class TresCalificacionDAO {

    ConexionBD conexion;
    
    double calificacion;
    
    int control;
    
    public TresCalificacionDAO(){
        conexion = new ConexionBD();
        
    }
    
    public void  actualizarCalificacion(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            
            String query = "UPDATE trescalificacion SET Calificacion = ? WHERE NoControl = ?";
            PreparedStatement prepared = accesoBD.prepareStatement(query);
            
            prepared.setDouble(1, calificacion);
            prepared.setInt(2, nControl);
            prepared.execute();
            
        }catch(Exception e){
            
        }
    }
    
    public int numeroControl(int nControl){
        
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT NoControl FROM trescalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                control = resultado.getInt("NoControl");
            }
            
            
        }catch(Exception e){
            
        }
        
        return control;
        
    }
    
    
    public double calificacionEjercicioUno(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM tresejerciciouno WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    
     public double calificacionEjercicioDos(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM tresejerciciodos WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
      public double calificacionEjercicioTres(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM tresejerciciotres WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
      
      public double calificacionEjercicioFinal(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM tresejerciciofinal WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
      
       public void calificacionFinal(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            String query = "INSERT INTO trescalificacion VALUES (?, ?)";
            
            PreparedStatement prepared = accesoBD.prepareCall(query);
            prepared.setInt(1, nControl);
            prepared.setDouble(2, calificacion);
            prepared.execute();
            
        }catch(Exception e){
            
        }
    }
    
}