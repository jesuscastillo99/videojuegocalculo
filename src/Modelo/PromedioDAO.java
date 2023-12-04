package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PromedioDAO {
    
    ConexionBD conexion;
    
    double calificacion;
    
    int control;
    
    public PromedioDAO(){
        conexion = new ConexionBD();
        
    }
    
    public double calificacionUno(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM unocalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    public double calificacionDos(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM doscalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    public double calificacionTres(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM trescalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    public double calificacionCuatro(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cuatrocalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    public double calificacionCinco(int nControl){
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cincocalificacion WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                calificacion = resultado.getDouble("Calificacion");
            }
            
        }catch(Exception e){
            
        }
        
        return calificacion;
    }
    
    
    
    public void  actualizarCalificacion(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            
            String query = "UPDATE promedio SET Calificacion = ? WHERE NoControl = ?";
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
            ResultSet resultado = numero.executeQuery("SELECT NoControl FROM promedio WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                control = resultado.getInt("NoControl");
            }
            
            
        }catch(Exception e){
            
        }
        
        return control;
        
    }
     
     public void calificacionFinal(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            String query = "INSERT INTO promedio VALUES (?, ?)";
            
            PreparedStatement prepared = accesoBD.prepareCall(query);
            prepared.setInt(1, nControl);
            prepared.setDouble(2, calificacion);
            prepared.execute();
            
        }catch(Exception e){
            
        }
    }
    
}