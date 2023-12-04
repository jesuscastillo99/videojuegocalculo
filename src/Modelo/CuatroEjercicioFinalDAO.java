package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CuatroEjercicioFinalDAO {
     ConexionBD conexion;
    int intentos;
    
    int control;
    
    public CuatroEjercicioFinalDAO(){
        conexion = new ConexionBD();
        
    }
    
    public void actualizarEjercicio(int nControl, int intento, double calificacion){
        try{
            Connection accesoBD = conexion.establecerConexion();
            String query = "UPDATE cuatroejerciciofinal SET Intentos = ?, Calificacion = ? WHERE NoControl = ?";
            
            PreparedStatement prepared = accesoBD.prepareStatement(query);
            
            prepared.setInt(1, intento);
            prepared.setDouble(2, calificacion);
            prepared.setInt(3, nControl);
            prepared.execute();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Modificar En La Base de Datos Cliente", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    
    public int numeroControl(int nControl){
        try{
            
            Connection accesoBD = conexion.establecerConexion();
            Statement numero = accesoBD.createStatement();
            ResultSet resultado = numero.executeQuery("SELECT NoControl FROM cuatroejerciciofinal WHERE NoControl = " + nControl);
        
            while(resultado.next()){
                control = resultado.getInt("NoControl");
               
            }
            
        }catch(Exception e){
            
        }
        
        return control;
    }
    
    public int intento(int nControl){
        
        try{
            Connection accesoBD = conexion.establecerConexion();
            Statement oportunidades = accesoBD.createStatement();
            ResultSet resultado = oportunidades.executeQuery("SELECT Intentos FROM cuatroejerciciofinal WHERE NoControl = " + nControl);
            
            while(resultado.next()){
                intentos = resultado.getInt("Intentos");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Obtener Intento", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        return intentos;
    }
    
    public void agregar(int nControl, int intento, double calificacion){
        
        try{
            Connection accesoBD = conexion.establecerConexion();
            String query = "INSERT INTO cuatroejerciciofinal VALUES (?, ?, ?)";
            
            PreparedStatement prepared = accesoBD.prepareStatement(query);
            prepared.setInt(1, nControl);
            prepared.setInt(2, intento);
            prepared.setDouble(3, calificacion);
            prepared.execute();
            
            JOptionPane.showMessageDialog(null, "¡Calificacion almacenada con éxito!", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Al Insertar En La Base de Datos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    
}