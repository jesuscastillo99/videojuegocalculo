package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DosCalificacionDAO {
    
    ConexionBD conexion;
    
    double calificacion;
    
    int control;
    
    public DosCalificacionDAO(){
        conexion = new ConexionBD();
        
    }
    
    public void  actualizarCalificacion(int nControl, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            
            String query = "UPDATE doscalificacion SET Calificacion = ? WHERE NoControl = ?";
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
            ResultSet resultado = numero.executeQuery("SELECT NoControl FROM doscalificacion WHERE NoControl = " + nControl);
            
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
            String query = "INSERT INTO doscalificacion VALUES (?, ?)";
            
            PreparedStatement prepared = accesoBD.prepareCall(query);
            prepared.setInt(1, nControl);
            prepared.setDouble(2, calificacion);
            prepared.execute();
            
        }catch(Exception e){
            
        }
    }
    
}
