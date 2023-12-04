package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CuatroCalificacionDAO {
    
     ConexionBD conexion;
    
    double calificacion;
    
    int control;
    
    public CuatroCalificacionDAO(){
        conexion = new ConexionBD();
        
    }
    
    public void  actualizarCalificacion(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            
            String query = "UPDATE cuatrocalificacion SET Calificacion = ? WHERE NoControl = ?";
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
            ResultSet resultado = numero.executeQuery("SELECT NoControl FROM cuatrocalificacion WHERE NoControl = " + nControl);
            
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
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cuatroejerciciouno WHERE NoControl = " + nControl);
            
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
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cuatroejerciciodos WHERE NoControl = " + nControl);
            
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
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cuatroejerciciotres WHERE NoControl = " + nControl);
            
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
            ResultSet resultado = numero.executeQuery("SELECT Calificacion FROM cuatroejerciciofinal WHERE NoControl = " + nControl);
            
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
            String query = "INSERT INTO cuatrocalificacion VALUES (?, ?)";
            
            PreparedStatement prepared = accesoBD.prepareCall(query);
            prepared.setInt(1, nControl);
            prepared.setDouble(2, calificacion);
            prepared.execute();
            
        }catch(Exception e){
            
        }
    }
    
}
